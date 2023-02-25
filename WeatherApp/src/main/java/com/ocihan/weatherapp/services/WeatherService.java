package com.ocihan.weatherapp.services;

import com.ocihan.weatherapp.entities.WeatherForecast;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final RestTemplate restTemplate;
    private String defaultCountryCode;
    @Value("${WEATHER_API_KEY}")
    private String weatherApiKey;
    @Value("${WEATHER_API_URL}")
    private String weatherApiUrl;


    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * @param cityName
     * @param countryCode
     */
    private void checkCityNameAndCountryCode(String cityName, String countryCode) {
        if (countryCode != null) {
            if (cityName.isEmpty() || cityName.isBlank() || countryCode.isEmpty() || countryCode.isBlank()) {
                defaultCountryCode = "," + countryCode;
                throw new IllegalArgumentException("cannot be empty");
            }
        }
        defaultCountryCode = "";
    }

    /**
     * @param cityName
     * @param countryCode
     * @return Bir haftalık hava durumunu verir.
     */
    public WeatherForecast WeatherOneWeek(String cityName, String countryCode) {
        checkCityNameAndCountryCode(cityName, countryCode);
        return restTemplate
                .getForObject(String.format("%s/forecast.json?key=%s&q=%s%s&days=7", weatherApiUrl, weatherApiKey, cityName, defaultCountryCode), WeatherForecast.class);
    }

    /**
     * @param cityName
     * @param countryCode
     * @return Bir aylık hava durumunu verir.
     */
    public WeatherForecast WeatherOneMonth(String cityName, String countryCode) {
        checkCityNameAndCountryCode(cityName, countryCode);
        return restTemplate
                .getForObject(String.format("%s/forecast.json?key=%s&q=%s%s&days=15", weatherApiUrl, weatherApiKey, cityName, defaultCountryCode), WeatherForecast.class);
    }

    /**
     * @param cityName
     * @param countryCode
     * @return Bir günlük hava durumunu verir.
     */
    public WeatherForecast WeatherOneDay(String cityName, String countryCode) {
        checkCityNameAndCountryCode(cityName, countryCode);
        return restTemplate
                .getForObject(String.format("%s/forecast.json?key=%s&q=%s%s&days=1", weatherApiUrl, weatherApiKey, cityName, defaultCountryCode), WeatherForecast.class);
    }


}
package com.ocihan.weatherapp.controllers;

import com.ocihan.weatherapp.entities.WeatherForecast;
import com.ocihan.weatherapp.services.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    /**
     *
     * @param cityName
     * @param country
     * @return Bİr haftalık hav durumunu verir.
     */
    @GetMapping("/getOneWeekWeather")
    public ResponseEntity<WeatherForecast> getForecastOneWeek(@RequestParam String cityName, @RequestParam(required = false) String country) {
        return ResponseEntity.status(HttpStatus.FOUND).body(weatherService.WeatherOneWeek(cityName, country));
    }

    /**
     *
     * @param cityName
     * @param country
     * @return Bir aylık hava durumunu verir.
     */
    @GetMapping("/getOneMonthWeather")
    public ResponseEntity<WeatherForecast> getForecastOneMonth(@RequestParam String cityName, @RequestParam(required = false) String country) {
        return ResponseEntity.status(HttpStatus.FOUND).body(weatherService.WeatherOneMonth(cityName, country));
    }
    /**
     *
     * @param cityName
     * @param country
     * @return Bir günlük hava durumunu verir.
     */
    @GetMapping("/getOneDayWeather")
    public ResponseEntity<WeatherForecast> getForecastOneDay(@RequestParam String cityName, @RequestParam(required = false) String country) {
        return ResponseEntity.status(HttpStatus.FOUND).body(weatherService.WeatherOneDay(cityName, country));
    }


}

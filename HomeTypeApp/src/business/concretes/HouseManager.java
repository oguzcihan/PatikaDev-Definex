package business.concretes;

import business.abstracts.HouseService;
import data.AppData;

/**
 * Ev tiplerinin business operasyonlarını ele alır.
 *
 * @author Oğuzhan Cihan
 * @since 2023-01-22
 */
public class HouseManager implements HouseService {
    private final AppData _appData;

    public HouseManager(AppData appData) {
        _appData = appData;
    }

    @Override
    public double totalHousePrice() {
        double total = 0;
        for (var house : _appData.getHouseList()) {
            total += house.getPrice();
        }
        return total;
    }

    @Override
    public double totalVillaPrice() {
        double total = 0;
        for (var villa : _appData.getVillaList()) {
            total += villa.getPrice();
        }
        return total;
    }

    @Override
    public double totalSummerhousePrice() {
        double total = 0;
        for (var summerHouse : _appData.getSummerhouseList()) {
            total += summerHouse.getPrice();
        }
        return total;
    }

    @Override
    public double allHouseTypePrice() {
        double total = 0;
        for (var house : _appData.getHouseList()) {
            total += house.getPrice();
        }
        for (var summerHouse : _appData.getSummerhouseList()) {
            total += summerHouse.getPrice();
        }
        for (var villa : _appData.getVillaList()) {
            total += villa.getPrice();
        }
        return total;
    }

    @Override
    public double houseAverageSquareMeter() {
        double squareMeter = 0;
        double averageSquareMeter;
        for (var house : _appData.getHouseList()) {
            squareMeter += house.getSquareMeters();
        }
        averageSquareMeter = squareMeter / _appData.getHouseList().size();

        return averageSquareMeter;
    }

    @Override
    public double villaAverageSquareMeter() {
        double squareMeter = 0;
        double averageSquareMeter;
        for (var house : _appData.getVillaList()) {
            squareMeter += house.getSquareMeters();
        }
        averageSquareMeter = squareMeter / _appData.getVillaList().size();

        return averageSquareMeter;
    }

    @Override
    public double summerhouseAverageSquareMeter() {
        double squareMeter = 0;
        double averageSquareMeter;
        for (var house : _appData.getSummerhouseList()) {
            squareMeter += house.getSquareMeters();
        }
        averageSquareMeter = squareMeter / _appData.getSummerhouseList().size();

        return averageSquareMeter;
    }

    @Override
    public double allTypeHouseAverageSquareMeter() {
        double squareMeter = 0;
        double averageSquareMeter;
        int allTypeSize;
        allTypeSize = _appData.getHouseList().size() + _appData.getVillaList().size() + _appData.getSummerhouseList().size();

        for (var house : _appData.getHouseList()) {
            squareMeter += house.getSquareMeters();
        }
        for (var house : _appData.getSummerhouseList()) {
            squareMeter += house.getSquareMeters();
        }
        for (var house : _appData.getSummerhouseList()) {
            squareMeter += house.getSquareMeters();
        }
        averageSquareMeter = squareMeter / allTypeSize;

        return averageSquareMeter;
    }

}

import business.abstracts.HouseService;
import business.concretes.HouseManager;
import data.AppData;

public class Main {

    public static void main(String[] args) {

        HouseService _service = new HouseManager(new AppData());
        String totalHousePrice = "Evlerin toplam fiyatları: " + _service.totalHousePrice();
        String totalVillaPrice = "Villaların toplam fiyatları: " + _service.totalVillaPrice();
        String totalSummerhousePrice = "Yazlıkların toplam fiyatları: " + _service.totalSummerhousePrice();
        String allHouseTypePrice = "Tüm ev tiplerinin toplam fiyatları: " + _service.allHouseTypePrice();
        String houseAverageSquareMeter = "Evlerin ortalama metrekaresi: " + _service.houseAverageSquareMeter();
        String villaAverageSquareMeter = "Villaların ortalama metrekaresi: " + _service.villaAverageSquareMeter();
        String summerhouseAverageSquareMeter = "Yazlıkların ortalama metrekaresi: " + _service.summerhouseAverageSquareMeter();
        String allHouseAverageSquareMeter = "Tüm ev tiplerinin ortalama metrekaresi: " + _service.allTypeHouseAverageSquareMeter();

        //Console Write
        System.out.printf("*%s\n*%s\n*%s\n*%s\n*%s\n*%s\n*%s\n*%s",
                totalHousePrice,
                totalVillaPrice,
                totalSummerhousePrice,
                allHouseTypePrice,
                houseAverageSquareMeter,
                villaAverageSquareMeter,
                summerhouseAverageSquareMeter,
                allHouseAverageSquareMeter
        );
    }
}

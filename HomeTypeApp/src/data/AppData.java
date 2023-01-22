package data;

import entites.House;
import entites.Summerhouse;
import entites.Villa;

import java.util.ArrayList;
import java.util.List;

/**
 * Ev tipleri için instance oluşturma işlemini ve liste methodlarını döner.
 *
 * @author Oğuzhan Cihan
 * @since 2023-01-22
 */
public class AppData {

    House villaOne = new Villa(1L, "Villa", 1000, 90, 7, 4);
    House villaTwo = new Villa(1L, "Villa", 500, 80, 4, 3);
    House villaThree = new Villa(1L, "Villa", 600, 60, 5, 2);

    House summerhouseOne = new Summerhouse(1L, "Summerhouse", 2000, 150, 4, 4);
    House summerhouseTwo = new Summerhouse(1L, "Summerhouse", 1500, 100, 6, 3);
    House summerhouseThree = new Summerhouse(1L, "Summerhouse", 800, 140, 9, 2);

    House houseTwo = new House(1L, "House", 2000, 200, 8, 3);
    House houseOne = new House(1L, "House", 1200, 140, 6, 4);
    House houseThree = new House(1L, "House", 700, 160, 9, 2);

    /**
     * Villa listesini döner
     */
    public List<Villa> getVillaList() {
        List<Villa> villaList = new ArrayList<>();
        villaList.add((Villa) villaOne);
        villaList.add((Villa) villaTwo);
        villaList.add((Villa) villaThree);

        return villaList;
    }

    /**
     * Yazlık listesini döner
     */
    public List<Summerhouse> getSummerhouseList() {
        List<Summerhouse> summerhouseList = new ArrayList<>();
        summerhouseList.add((Summerhouse) summerhouseOne);
        summerhouseList.add((Summerhouse) summerhouseTwo);
        summerhouseList.add((Summerhouse) summerhouseThree);

        return summerhouseList;
    }

    /**
     * Ev listesini döner.
     */
    public List<House> getHouseList() {
        List<House> houseList = new ArrayList<>();
        houseList.add((House) houseOne);
        houseList.add((House) houseTwo);
        houseList.add((House) houseThree);

        return houseList;
    }
}

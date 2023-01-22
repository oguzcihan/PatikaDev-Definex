package business.abstracts;

/**
 * Ev tiplerinin business operasyonlarını ele alan interface.
 *
 * @author Oğuzhan Cihan
 * @since 2023-01-22
 */
public interface HouseService {

    /**
     * @return Total house prices
     */
    double totalHousePrice();

    /**
     * @return Total villa prices
     */
    double totalVillaPrice();

    /**
     * @return Total summerhouse prices
     */
    double totalSummerhousePrice();

    /**
     * @return Prices of all houses
     */
    double allHouseTypePrice();

    /**
     * @return The average square feet of houses.
     */
    double houseAverageSquareMeter();

    /**
     * @return The average square meter of the villas
     */
    double villaAverageSquareMeter();

    /**
     * @return The average square feet of the summerhouse.
     */
    double summerhouseAverageSquareMeter();

    /**
     * @return The average square meter of all houses
     */
    double allTypeHouseAverageSquareMeter();


}

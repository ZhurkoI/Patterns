package builder;

public class CountryHouseBuilder extends HouseBuilder {
    @Override
    void buildMaterial() {
        house.setMaterial(Material.WOOD);
    }

    @Override
    void buildSwimmingPool() {
        house.ifSwimmingPoolExists(true);
    }

    @Override
    void buildFrontYard() {
        house.ifFrontYardExists(true);
    }

    @Override
    void buildLocation() {
        house.setLocation(Location.COUNTRY);
    }

    @Override
    void buildPrice() {
        house.setPrice(10_000);
    }
}

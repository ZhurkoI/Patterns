package builder;

public class Director {
    HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse() {
        builder.createHouse();
        builder.buildMaterial();
        builder.buildLocation();
        builder.buildFrontYard();
        builder.buildSwimmingPool();
        builder.buildPrice();

        House house = builder.getHouse();
        return house;
    }
}

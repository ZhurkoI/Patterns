package builder;

public abstract class HouseBuilder {
    House house;

    void createHouse() {
        this.house = new House();
    }

    abstract void buildMaterial();

    abstract void buildSwimmingPool();

    abstract void buildFrontYard();

    abstract void buildLocation();

    abstract void buildPrice();

    House getHouse() {
        return house;
    }
}

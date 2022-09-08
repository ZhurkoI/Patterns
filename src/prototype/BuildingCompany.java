package prototype;

public class BuildingCompany {

    public static void main(String[] args) {
        House initHouse = new House(Material.WOOD, 20_000, Location.CITY);
        System.out.println(initHouse);

        HouseFactory factory = new HouseFactory(initHouse);
        House houseA = factory.cloneHouse();
        System.out.println(houseA);
    }
}

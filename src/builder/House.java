package builder;

public class House {

    private Material material;
    private boolean swimmingPoolExists;
    private boolean frontYardExists;
    private Location location;
    private int price;

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void ifSwimmingPoolExists(boolean swimmingPoolExists) {
        this.swimmingPoolExists = swimmingPoolExists;
    }

    public void ifFrontYardExists(boolean frontYardExists) {
        this.frontYardExists = frontYardExists;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "material=" + material +
                ", swimmingPoolExists=" + swimmingPoolExists +
                ", frontYardExists=" + frontYardExists +
                ", location=" + location +
                ", price=" + price +
                '}';
    }
}

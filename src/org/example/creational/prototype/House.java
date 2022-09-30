package org.example.creational.prototype;

public class House implements Copyable {

    Material material;
    int price;
    Location location;

    public House(Material material, int price, Location location) {
        this.material = material;
        this.price = price;
        this.location = location;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    @Override
    public Object clone() {
        House copy = new House(material, price, location);
        return copy;
    }

    @Override
    public String toString() {
        return "House{" +
                "material=" + material +
                ", price=" + price +
                ", location=" + location +
                '}';
    }
}

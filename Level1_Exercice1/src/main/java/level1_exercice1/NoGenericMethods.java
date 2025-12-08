package level1_exercice1;

public class NoGenericMethods {

    private String name;
    private String brand;
    private String color;

    public NoGenericMethods(String name, String brand, String color) {
        this.name = name;
        this.brand = brand;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return  color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "[Name: " + this.getName() + "] [Brand: " + this.getBrand() +
                "] [Color: " + getColor() + "]";
    }
}

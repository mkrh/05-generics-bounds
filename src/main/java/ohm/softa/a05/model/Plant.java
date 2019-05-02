package ohm.softa.a05.model;

public abstract class Plant implements Comparable<Plant> {
    private double height;
    private String family;
    private String name;

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public Plant(double height, String family, String name) {
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public abstract PlantColor getColor();

    @Override
    public int compareTo(Plant plant) {
        return Double.compare(this.height, plant.height);
    }

    @Override
    public String toString() {
        return String.format("Plant: Height %s, Family %s, Name %s", getHeight(), getFamily(), getName());
    }
}

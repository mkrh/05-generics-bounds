package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;

public class PlantBed<T extends Plant> {
    private SimpleList<T> simpleList = new SimpleListImpl<>();

    public void add(T p) {
        simpleList.add(p);
    }

    public int size() {
        return simpleList.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        return this.simpleList.filter(p -> p.getColor() == color);
    }
}

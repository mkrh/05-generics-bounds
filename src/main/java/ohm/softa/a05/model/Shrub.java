package ohm.softa.a05.model;

import java.lang.reflect.Modifier;

public class Shrub extends Plant {
    @Override
    public PlantColor getColor() {
        return PlantColor.GREEN;
    }

    public Shrub(double height, String family, String name) {
        super(height, family, name);
    }
}

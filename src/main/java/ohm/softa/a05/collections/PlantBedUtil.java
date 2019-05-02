package ohm.softa.a05.collections;

import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUtil {
    private PlantBedUtil() {}

    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> plantBed) {
        Map<PlantColor, SimpleList<T>> map = new HashMap<>();
        for (PlantColor pc: PlantColor.values()) {
            map.put(pc, plantBed.getPlantsByColor(pc));
        }
        return map;
    }
}

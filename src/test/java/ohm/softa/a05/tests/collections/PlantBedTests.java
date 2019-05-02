package ohm.softa.a05.tests.collections;

import ohm.softa.a05.collections.PlantBedUtil;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static ohm.softa.a05.collections.PlantBedUtil.splitBedByColor;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantBedTests {
    private PlantBed<Plant> plantBed;

    @BeforeEach
    void setup(){
        plantBed = new PlantBed<>();

        plantBed.add(new Shrub(2.1, "Peter", "lololol"));
        plantBed.add(new Shrub(3.1, "Peter", "keil"));
        plantBed.add(new Shrub(4.1, "Peter", "zwegat"));
        plantBed.add(new Shrub(5.1, "Peter", "Hans"));
        plantBed.add(new Shrub(0.1, "Peter", "Dampf"));
        plantBed.add(new Shrub(3.1, "Peter", "leil"));

        plantBed.add(new Flower(4.2, "Flower", "blue", PlantColor.BLUE));
        plantBed.add(new Flower(4.2, "Flower", "orange", PlantColor.ORANGE));
        plantBed.add(new Flower(4.2, "Flower", "red", PlantColor.RED));
    }

    @Test
    void testGetPlantsByColor(){
        SimpleList<Plant> sl = plantBed.getPlantsByColor(PlantColor.GREEN);
        assertEquals(6, sl.size());
    }

    @Test
    void test420(){
        Map<PlantColor, SimpleList<Plant>> map = PlantBedUtil.splitBedByColor(plantBed);
        assert(map.get(PlantColor.GREEN).size() == 6);
        assert(map.get(PlantColor.BLUE).size() == 1);
        assert(map.get(PlantColor.ORANGE).size() == 1);
        assert(map.get(PlantColor.RED).size() == 1);
    }
}

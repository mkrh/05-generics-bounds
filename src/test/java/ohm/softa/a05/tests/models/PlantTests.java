package ohm.softa.a05.tests.models;

import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PlantTests {

    @BeforeEach
    void setup(){

    }

    @Test
    void testCreateShrub(){
        try {
            Shrub s = new Shrub(2.1, "kek", "lol");
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void testCreateFlowerGreen(){
        try {
            Flower f = new Flower(2.1, "kek", "lol", PlantColor.GREEN);
            fail();
        } catch (Exception e) {

        }
    }

    @Test
    void testCreateFlowerBlue(){
        try {
            Flower f = new Flower(2.1, "kek", "lol", PlantColor.BLUE);
        } catch (Exception e) {
            fail();
        }
    }

}

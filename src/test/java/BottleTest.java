import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle = new Bottle(100);

    @Test
    public void shouldRemove10volWhenDrink(){

        int initialVol = bottle.getVolume();

        bottle.drink();
        int volumeAfterDrinking = bottle.getVolume();

        assertEquals(volumeAfterDrinking, initialVol - 10);
    }

    @Test
    public void volDownTo0WhenEmptied(){

        bottle.empty();
        int volAfterEmptyBottle = bottle.getVolume();

        assertEquals(volAfterEmptyBottle, 0);

    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVol(){
        assertEquals(100, waterBottle.volume);
    }

    @Test
    public void hasDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.volume);
    }

    @Test
    public void hasNone(){
        waterBottle.empty();
        assertEquals(0, waterBottle.volume);
    }

    @Test
    public void isFull(){
        waterBottle.fill();
        assertEquals(100, waterBottle.volume);
    }
}

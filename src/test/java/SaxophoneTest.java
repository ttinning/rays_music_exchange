import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
    saxophone = new Saxophone("Selmer", "SA80/11", "Gold", 20490);
    }

    @Test
    public void hasBrand() {
        assertEquals("Selmer", saxophone.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("SA80/11", saxophone.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", saxophone.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(20490, saxophone.getPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("JAZZ HANDS", saxophone.play());
    }

}

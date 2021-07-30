import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Steinway & Sons", "B-211", "Black", "Grand Piano", 120000);
    }

    @Test
    public void hasBrand() {
        assertEquals("Steinway & Sons", piano.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("B-211", piano.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Grand Piano", piano.getType());
    }

    @Test
    public void hasPrice() {
        assertEquals(120000, piano.getPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Dum, Dum, Dum, DUM!!", piano.play());
    }
}

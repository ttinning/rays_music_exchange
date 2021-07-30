import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Guitar bassGuitar;
    Guitar guitar1;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "Parallel Universe II Telecaster", "Magico Trans Surf Green", "Right Hand", 6, 500.00, 1800.00);
        bassGuitar = new Guitar("Fender", "Player Jazz Bass", "Buttercream", "Left Hand", 4, 250.00, 690.00);
        guitar1 = new Guitar("Strandberg", "Boden Metal 8", "Black Pearl", "Right Hand", 8,1000.00, 2200.00);
    }

    @Test
    public void canGetBrandOfGuitar() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void canGetModelOfGuitar() {
        assertEquals("Parallel Universe II Telecaster", guitar.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Buttercream", bassGuitar.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("Right Hand", guitar1.getType());
    }

    @Test
    public void canPlayTheGuitar() {
        assertEquals("Strummmmmm", guitar.play());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(8, guitar1.getNumberOfStrings(), 0.01);
    }

    @Test
    public void canGetPrice() {
        assertEquals(500.00, guitar.getWholesalePrice(), 0.01);
    }
}

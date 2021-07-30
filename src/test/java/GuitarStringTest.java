import Accessories.GuitarString;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString("Ernie Ball", "Regular Slinky", "10-46", 2.99, 5.99);
    }

    @Test
    public void checkStringsHaveBrand() {
        assertEquals("Ernie Ball", guitarString.getBrand());
    }

    @Test
    public void checkStringsHaveCollection() {
        assertEquals("Regular Slinky", guitarString.getCollection());
    }

    @Test
    public void checkStringsHasSizes() {
        assertEquals("10-46", guitarString.getSize());
    }

    @Test
    public void checkStringsHasPrice() {
        assertEquals(2.99, guitarString.getWholesalePrice(), 0.01);
    }

    @Test
    public void checkStringHasSellingPrice() {
        assertEquals(5.99, guitarString.getSalePrice(), 0.01);
    }

    @Test
    public void checkStringsHasMarkup() {
        assertEquals(3, guitarString.calculateMarkUp(), 0.01);
    }

}

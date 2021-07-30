import Accessories.GuitarString;
import Accessories.SheetMusic;
import behaviours.ISell;
import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell guitar;
    ISell piano;
    ISell guitarString;
    ISell sheetMusic;

    @Before
    public void before() {
        shop = new Shop("Ray's", 500000.00);
        guitarString = new GuitarString("Ernie Ball", "Regular Slinky", "10-46", 2.99, 5.99);
        guitar = new Guitar("Fender", "Parallel Universe II Telecaster", "Magico Trans Surf Green", "Right Hand", 6, 800.00,1800.00);
        sheetMusic = new SheetMusic("Learn To Fly", "Dave Grohl", 0.50, 1.99);
        piano = new Piano("Steinway & Sons", "B-211", "Black", "Grand Piano",20000.00, 120000.00);
    }

    @Test
    public void canGetNameOfShop() {
        assertEquals("Ray's", shop.getName());
    }

    @Test
    public void canGetTotalTill() {
        assertEquals(500000.00, shop.getTill(), 0.01);
    }

    @Test
    public void canGetStockAtZero() {
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canAddStock() {
        shop.addItem(guitar);
        assertEquals(1, shop.getStock(),0.01);
    }

    @Test
    public void canRemoveStock() {
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.getStock(), 0.01);
    }
}

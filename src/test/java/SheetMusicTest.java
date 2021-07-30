import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Learn To Fly", "Dave Grohl", 0.50, 1.99);
    }

    @Test
    public void checkSheetMusicHasTitle() {
        assertEquals("Learn To Fly", sheetMusic.getTitle());
    }

    @Test
    public void checkSheetMusicHasArtist() {
        assertEquals("Dave Grohl", sheetMusic.getArtist());
    }

    @Test
    public void checkSheetMusicHasWholesalePrice() {
        assertEquals(0.50, sheetMusic.getWholesalePrice(), 0.01);
    }

    @Test
    public void checkSheetMusicHasSalePrice() {
        assertEquals(1.99, sheetMusic.getSalePrice(),0.01);
    }

    @Test
    public void checkSheetMusicMarkUpValue() {
        assertEquals(1.49, sheetMusic.calculateMarkUp(), 0.01);
    }



}

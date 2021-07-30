package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Saxophone extends Instrument implements IPlay, ISell {

    public Saxophone(String brand, String model, String colour, Double wholesalePrice, Double salePrice) {
        super(brand, model, colour, wholesalePrice, salePrice);
    }


    @Override
    public String play() {
        return "JAZZ HANDS";
    }

    @Override
    public double calculateMarkUp() {
        return this.getSalePrice() - this.getWholesalePrice();
    }
}

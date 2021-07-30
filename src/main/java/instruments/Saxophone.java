package instruments;

import behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay {

    public Saxophone(String brand, String model, String colour, Integer price) {
        super(brand, model, colour, price);
    }


    @Override
    public String play() {
        return "JAZZ HANDS";
    }
}

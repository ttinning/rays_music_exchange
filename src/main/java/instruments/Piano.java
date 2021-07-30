package instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private String type;

    public Piano(String brand, String model, String colour, String type,  Integer price) {
        super(brand, model, colour, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String play() {
        return "Dum, Dum, Dum, DUM!!";
    }
}
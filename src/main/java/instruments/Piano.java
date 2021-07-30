package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private String type;

    public Piano(String brand, String model, String colour, String type,  Double wholesalePrice, Double salePrice) {
        super(brand, model, colour, wholesalePrice, salePrice);
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

    @Override
    public double calculateMarkUp() {
        return this.getSalePrice() - this.getWholesalePrice();
    }
}
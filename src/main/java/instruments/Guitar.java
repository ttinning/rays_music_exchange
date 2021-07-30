package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private String type;
    private Integer numberOfStrings;

    public Guitar(String brand, String model, String colour, String type, Integer numberOfStrings, Double wholesalePrice, Double salePrice) {
        super(brand, model, colour, wholesalePrice, salePrice);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(Integer numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "Strummmmmm";
    }

    @Override
    public double calculateMarkUp() {
        return this.getSalePrice() - this.getWholesalePrice();
    }
}

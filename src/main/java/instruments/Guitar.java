package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private String type;
    private Integer numberOfStrings;

    public Guitar(String brand, String model, String colour, String type, Integer numberOfStrings, Integer price) {
        super(brand, model, colour, price);
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
}

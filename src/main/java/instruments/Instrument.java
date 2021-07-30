package instruments;

public abstract class Instrument {

    private String brand;
    private String model;
    private String colour;
    private Double wholesalePrice;
    private Double salePrice;

    public Instrument(String brand, String model, String colour, Double wholesalePrice, Double salePrice) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.wholesalePrice = wholesalePrice;
        this.salePrice = salePrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(Double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }
}

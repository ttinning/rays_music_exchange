package Accessories;

import behaviours.ISell;

public class GuitarString implements ISell {

    private String brand;
    private String collection;
    private String size;
    private Double wholesalePrice;
    private Double salePrice;

    public GuitarString(String brand, String collection, String size, Double wholesalePrice, Double salePrice) {
        this.brand = brand;
        this.collection = collection;
        this.size = size;
        this.wholesalePrice = wholesalePrice;
        this.salePrice = salePrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    @Override
    public double calculateMarkUp() {
        return this.salePrice - this.wholesalePrice;
    }
}

package Accessories;

import behaviours.ISell;

public class SheetMusic implements ISell {

    private String title;
    private String artist;
    private double wholesalePrice;
    private double salePrice;

    public SheetMusic(String title, String artist, double wholesalePrice, double salePrice) {
        this.title = title;
        this.artist = artist;
        this.wholesalePrice = wholesalePrice;
        this.salePrice = salePrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public double calculateMarkUp() {
        return this.salePrice - this.wholesalePrice;
    }
}


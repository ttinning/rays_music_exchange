import behaviours.ISell;

import java.sql.Array;
import java.util.ArrayList;

public class Shop {

    private String name;
    private Double till;
    private ArrayList<ISell> stock;

    public Shop(String name, Double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTill() {
        return till;
    }

    public void setTill(Double till) {
        this.till = till;
    }

    public int getStock() {
        return this.stock.size();
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }


    public double getCalculateProfit() {
        double totalProfit = 0;
        for (ISell item: stock) {
            totalProfit += item.calculateMarkUp();
        }
        return totalProfit;
    }
}





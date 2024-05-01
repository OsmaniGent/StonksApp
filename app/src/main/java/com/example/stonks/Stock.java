package com.example.stonks;

public class Stock {
    private String name;
    private double currentPrice;
    private double priceChange;
    private double priceChangePercentage;

    public Stock(String name, double currentPrice, double priceChange, double priceChangePercentage) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.priceChange = priceChange;
        this.priceChangePercentage = priceChangePercentage;
    }

    public String getName() {
        return name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getPriceChange() {
        return priceChange;
    }

    public double getPriceChangePercentage() {
        return priceChangePercentage;
    }
}

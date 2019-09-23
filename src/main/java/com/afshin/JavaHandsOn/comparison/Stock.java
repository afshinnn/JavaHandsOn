package com.afshin.JavaHandsOn.comparison;

public class Stock {
    private String ticker;
    private double price;
    private double capital;


    Stock(String ticker, double price, double capital) {
        this.ticker = ticker;
        this.price = price;
        this.capital = capital;
    }

    String getTicker() {
        return ticker;
    }

    double getPrice() {
        return price;
    }

    double getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "Stock{" +
            "ticker='" + ticker + "'" +
            ", price=" + price +
            ", capital=" + capital +
            '}';
    }
}

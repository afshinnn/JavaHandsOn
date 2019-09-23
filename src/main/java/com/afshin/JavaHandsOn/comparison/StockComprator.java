package com.afshin.JavaHandsOn.comparison;

import java.util.Comparator;

/**
 * Compares to stock objects in the following order
 * 1 - stock ticker
 * 2 - company capital
 * 3 - stock price
 */
public class StockComprator implements Comparator<Stock> {

    @Override
    public int compare(Stock o1, Stock o2) {
        if (o1.equals(o2)) {
            return 0;
        }

        if (o2 == null) {
            return 1;
        }

        int nameCompare = o1.getTicker().compareTo(o2.getTicker());
        if (nameCompare != 0) {
            return nameCompare;
        }

        int capitalCompare = Double.compare(o1.getCapital(), o2.getCapital());
        if (capitalCompare != 0) {
            return capitalCompare;
        }

        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

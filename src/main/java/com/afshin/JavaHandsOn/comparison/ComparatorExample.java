package com.afshin.JavaHandsOn.comparison;

import java.util.ArrayList;
import java.util.List;

public class ComparatorExample {
    public void run() {
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("AAPL", 210.5, 400));
        stocks.add(new Stock("NFLX", 380.63, 200));
        stocks.add(new Stock("NFLX", 340, 200));
        stocks.add(new Stock("NFLX", 280, 200));
        stocks.add(new Stock("AAPL", 212, 400));

        stocks.sort(new StockComprator());

        for (Stock stock: stocks) {
            System.out.println(stock);
        }
    }
}

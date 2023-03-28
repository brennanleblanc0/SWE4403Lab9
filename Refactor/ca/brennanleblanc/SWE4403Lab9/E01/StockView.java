package ca.brennanleblanc.SWE4403Lab9.E01;

import java.util.ArrayList;
import java.util.List;

public abstract class StockView {
    protected List<Stock> stocks = new ArrayList<>();

    public void update(Stock stock) {
        if (stock != null) {
            for (Stock curStock : stocks) {
                if (curStock.getSymbol().equals(stock.getSymbol())) {
                    curStock.setPrice(stock.getPrice());
                }
            }
        }
        show();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public abstract void show();
}

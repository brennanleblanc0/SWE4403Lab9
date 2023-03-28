package ca.brennanleblanc.SWE4403Lab9.E01;

import java.util.ArrayList;
import java.util.List;

public class PriceChange {
    private List<StockView> subscribers;

    public PriceChange() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(StockView subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(StockView subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(Stock stock) {
        for (StockView stockView : subscribers) {
            stockView.update(stock);
        }
    }
}

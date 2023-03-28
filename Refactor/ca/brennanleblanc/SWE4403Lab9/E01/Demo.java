package ca.brennanleblanc.SWE4403Lab9.E01;

public class Demo {
    public static void main(String[] args) {
        StockView bar = new StatusBar();
        StockView list = new StockListView();

        Stock hpe = new Stock("HPE", 14.20);
        Stock bce = new Stock("BCE", 60.55);

        bar.addStock(bce);

        list.addStock(bce);
        list.addStock(hpe);

        PriceChange change = new PriceChange();
        change.subscribe(list);
        change.subscribe(bar);

        System.out.println("Before Update");
        change.notifySubscribers(null);

        Stock hpeUpdate = new Stock("HPE", 15.35);
        System.out.println("\nAfter Update");
        change.notifySubscribers(hpeUpdate);

    }
}

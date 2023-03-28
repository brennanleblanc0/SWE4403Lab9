package ca.brennanleblanc.SWE4403Lab9.E01;

public class Demo {
    public static void main(String[] args) {
        StockView bar = new StatusBar();
        StockView list = new StockListView();

        PriceChange change = new PriceChange();

        Stock hpe = new Stock("HPE", 14.20, change);
        Stock bce = new Stock("BCE", 60.55, change);

        bar.addStock(bce);

        list.addStock(bce);
        list.addStock(hpe);

        change.subscribe(list);
        change.subscribe(bar);

        System.out.println("Before Update");
        bar.show();
        list.show();

        System.out.println("\nAfter Updating HPE");
        hpe.setPrice(15.35);

        System.out.println("\nAfter updating BCE");
        bce.setPrice(65.55);
    }
}

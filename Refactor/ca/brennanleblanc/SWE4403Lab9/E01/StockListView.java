package ca.brennanleblanc.SWE4403Lab9.E01;

public class StockListView extends StockView {

    @Override
    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }
}

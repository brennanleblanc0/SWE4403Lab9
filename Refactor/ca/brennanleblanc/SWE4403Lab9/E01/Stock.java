package ca.brennanleblanc.SWE4403Lab9.E01;

public class Stock {
    private String symbol;
    private double price;
    private PriceChange change;

    public Stock(String symbol, double price, PriceChange change) {
        this.symbol = symbol;
        this.price = price;
        this.change = change;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        change.notifySubscribers(this);
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}

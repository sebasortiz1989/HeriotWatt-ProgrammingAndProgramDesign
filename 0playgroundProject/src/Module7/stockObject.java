package Module7;

public class stockObject {
    public static void main(String[] args) {
        Stock stock = new Stock("SUNW", "Sun MicroSystems Inc.");
        stock.setPreviousClosingPrice(100f);
        stock.setCurrentPrice(90f);
        double changePercent = stock.getChangePercent();
        System.out.println("The last changed percentage is: " + changePercent * 100 + "%");
    }
}

class Stock {
    private double previousClosingPrice;
    private double currentPrice;

    public Stock() {
    }

    public Stock(String symbol, String nameOfStock) {
        this.name = nameOfStock;
        this.symbol = symbol;
    }

    public String name;

    public String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}
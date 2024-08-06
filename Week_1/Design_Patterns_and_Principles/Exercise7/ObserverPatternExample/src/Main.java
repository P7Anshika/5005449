public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();
        
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);
        
        stockMarket.setStockPrice(150.00); // Notify observers
        
        stockMarket.deregisterObserver(mobileApp);
        
        stockMarket.setStockPrice(155.00); // Notify remaining observers
    }
}

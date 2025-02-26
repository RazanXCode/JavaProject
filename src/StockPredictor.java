public class StockPredictor {
    private Product product;
    private double averageDailySales;

    // Constructor
    public StockPredictor(Product product, double averageDailySales) {
        this.product = product;
        this.averageDailySales = averageDailySales;
    }

    // Method to predict when stock will run out
    public int daysUntilStockRunsOut() {
        return (int) Math.ceil(product.getStockLevel() / averageDailySales);
    }

    // Method to suggest a restocking strategy
    public String suggestRestockStrategy() {
        int daysLeft = daysUntilStockRunsOut();
        if (daysLeft <= 0) {
            return "High: Plan for restocking later on.";
        } else if (daysLeft <= 5) {
            return "Moderate: Consider restocking soon.";
        } else if (daysLeft <= 10) {
            return "low:Restock immediately to avoid shortages.";
        } else {
            return "Sufficient stock available. Monitor usage trends.";
        }
    }
}

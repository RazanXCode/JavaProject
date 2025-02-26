import java.util.UUID;

public class Product {
    private UUID productId;
    private String name;
    private double price;
    private int stockLevel;
    private int reorderThreshold;

    // Constructor
    public Product(String name, double price, int stockLevel, int reorderThreshold) {
        this.productId = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
        this.reorderThreshold = reorderThreshold;
    }

    // Getters
    public UUID getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public int getReorderThreshold() {
        return reorderThreshold;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public void setReorderThreshold(int reorderThreshold) {
        this.reorderThreshold = reorderThreshold;
    }

    public void displayDetailes(){
        System.out.println("Product ID:" + this.getProductId());
        System.out.println("Name:" + this.getName());
        System.out.println("Price:" + this.getPrice()+" $");
        System.out.println("Stock level:"+ this.getStockLevel());
        System.out.println("Reorder Threshold::"+this.getReorderThreshold());


    }





}

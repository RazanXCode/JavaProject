import java.util.Scanner;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Create products
                Product laptop = new Product("Laptop", 1200.0, 20, 5);
                Product smartphone = new Product("Smartphone", 800.0, 10, 3);


                // User input for average daily sales
                System.out.print("Enter average daily sales for Laptop: ");
                double laptopSales = scanner.nextDouble();
                System.out.print("Enter average daily sales for Smartphone: ");
                double smartphoneSales = scanner.nextDouble();

                // Display product details
                System.out.println("\nProduct Details:");
                laptop.displayDetailes();
                System.out.println("----------------------------");
                smartphone.displayDetailes();
                System.out.println("----------------------------");

                // Stock predictions
                StockPredictor laptopPredictor = new StockPredictor(laptop, laptopSales);
                StockPredictor smartphonePredictor = new StockPredictor(smartphone, smartphoneSales);

                System.out.println("Stock Prediction for Laptop:");
                System.out.println("Days until stock out: " + laptopPredictor.daysUntilStockRunsOut());
                System.out.println("Restock Suggestion: " + laptopPredictor.suggestRestockStrategy());

                System.out.println("Stock Prediction for Smartphone:");
                System.out.println("Days until stock out: " + smartphonePredictor.daysUntilStockRunsOut());
                System.out.println("Restock Suggestion: " + smartphonePredictor.suggestRestockStrategy());

                scanner.close();


            Order order = new Order("Razan", 1);
            OrderManager trackorder = new OrderManager();
            trackorder.processOrder(order);
            order.getOrderStatus();
            trackorder.shutdown();



            }
        }




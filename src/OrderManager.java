
import java.util.concurrent.*;

class OrderManager {
    private ExecutorService executor = Executors.newCachedThreadPool();

    public void processOrder(Order order) {
        executor.submit(() -> {
            try {
                System.out.println("Hello from Razan Branch! "); // Deleted the conflicting line manually
                System.out.println("Hello Customer: " + order.getCustomerName());
                // change state using setter and sleep
                System.out.println("Processing order: " + order.getOrderId());
                Thread.sleep(2000);
                order.setOrderStatus(Order.OrderStatus.SHIPPED);
                // change state using setter and sleep
                System.out.println("Order " + order.getOrderId() + " status updated to " + order.getOrderStatus());
                Thread.sleep(3000);
                order.setOrderStatus(Order.OrderStatus.DELIVERED);
                System.out.println("Order " + order.getOrderId() + " status updated to " + order.getOrderStatus());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // catch any errors
            }
        });
    }

    public void shutdown() {
        executor.shutdown();

    }

}
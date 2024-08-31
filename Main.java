import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;



public class Main {
    
    public static void main(String[] args) {
        boolean valid = true;
        Scanner scanner = new Scanner(System.in);
        Customer customer1 = new Customer("1", "John Doe", "john@example.com","123, Copeland");
        Customer customer2 = new Customer("2", "Jane Doe", "jane@example.com", "21 Copeland");

        ProductManagement product1 = new ProductManagement("P1", "Laptop", "A high-end laptop", 1200.00, 5);
        ProductManagement product2 = new ProductManagement("P2", "Mouse", "Wireless mouse", 50.00, 10);
        ProductManagement product3 = new ProductManagement("P3", "Keyboard", "Mechanical keyboard", 80.00, 8);
        
        System.out.println(product1.searchProduct("Mouse"));
        Order order1 = new Order("ORD1", customer1, Arrays.asList(product2, product2,product2));
        Order order2 = new Order("ORD2", customer1, Arrays.asList(product2, product2));
        Order order3 = new Order("ORD3", customer2, Arrays.asList(product2, product3,product1));

        List<Order> orders = Arrays.asList(order1, order2, order3);
        Analytics analyticsService = new Analytics(orders);

        double totalSales = analyticsService.calculateTotalSales();
        System.out.println("Total Sales: $" + totalSales);


        Map<ProductManagement, Long> topSellingProducts = analyticsService.getTopSellingProducts(3);
        topSellingProducts.forEach((product, count) -> 
            System.out.println(product.getName() + " sold " + count + " times")
        );


        List<Order> johnsOrders = analyticsService.getCustomerPurchaseHistory(customer1);
        System.out.println("John Doe's Order History: " + johnsOrders.size() + " orders");

        List<Order> johnOrders = analyticsService.getCustomerPurchaseHistory(customer2);
        System.out.println("John Doe's Order History: " + johnOrders.size() + " orders");

    }
}


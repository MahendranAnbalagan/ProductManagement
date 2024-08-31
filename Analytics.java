

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Analytics {
    private List<Order> orderlist;

    public Analytics(List<Order> orderlist){
        this.orderlist = orderlist;
    }

    public double calculateTotalSales() {
        return orderlist.stream()
                .mapToDouble(Order::getTotalAmount)
                .sum();

    }  
    
    public Map<ProductManagement, Long> getTopSellingProducts(int topN) {
        return orderlist.stream()
                .flatMap(order -> order.getProductList().stream()) 
                .collect(Collectors.groupingBy(product -> product, Collectors.counting())) 
                .entrySet().stream()
                .sorted(Map.Entry.<ProductManagement, Long>comparingByValue().reversed()) 
                .limit(topN) 
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); 
    }

    public List<Order> getCustomerPurchaseHistory(Customer customer) {
        return orderlist.stream()
                .filter(order -> order.getCustomer().equals(customer))
                .collect(Collectors.toList());
    }
}


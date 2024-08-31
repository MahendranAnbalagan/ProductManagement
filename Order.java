

import java.time.LocalDateTime;

import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<ProductManagement> productList;
    private  LocalDateTime orderDate;
    private double totalAmount;
    private String status;

    public Order(String orderId, Customer customer, List<ProductManagement> protectManagements){
        this.orderId = orderId;
        this.customer = customer;
        this.productList = protectManagements;
        this.orderDate = LocalDateTime.now();
        this.totalAmount = calculateAmount();
        this.status = "Pending";
    }

    public double calculateAmount(){
        return productList.stream()
        .mapToDouble(ProductManagement :: getPrice)
        .sum();
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<ProductManagement> getProductList() {
        return productList;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
/*
 * Order Processing:
Create an Order class with attributes like orderId, customer, 
productList, orderDate, and totalAmount.
Implement functionality to create orders, update order status, 
and view order history for customers.
 */
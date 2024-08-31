

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String address;
    private List<String> purchaseHistory;
    protected List<Customer> customers = new ArrayList<>();

    public Customer(String id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.purchaseHistory = new ArrayList<>();
        customers.add(this);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void addPurchaseHistory(String purchase) {
        purchaseHistory.add(purchase);
    }

    public Customer getCustomer(String id){
        for(Customer customer : customers){
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        System.out.println("Customer not found.");
        return null;
    }



    @Override
    public String toString(){
        return "Customername: " + name + "\n Id: " + id + "\n Email: " + email + "\n Address: " + address + "\n PurchaseHistory: " + purchaseHistory;
    }

    

    



}

/*
 * Customer Management:
Create a Customer class with attributes like id, name, email, address, and purchaseHistory.
Implement functionality to add new customers, update customer information, and retrieve customer data
 */
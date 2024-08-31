

import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    private String id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
    private static List<ProductManagement> productManagements = new ArrayList<>();


    public ProductManagement(String id, String name, String description, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        productManagements.add(this);

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
    public String getDescription(String name) {
        for (ProductManagement management : productManagements) {
            if (management.getName().equals(name)) {
                return management.description; 
            }
        }
        return "The Protect is not listed.";
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice(String name) {
        for (ProductManagement protectManagement : productManagements) {
            if (protectManagement.getName().equals(name)) {
                return protectManagement.price;
            }
        }
        System.out.println("The protect is not listed.");
        return (Double) null;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public List<ProductManagement> getrproduct(){
        return productManagements;
    }

    public static void deleteproduct(String name){
       productManagements.removeIf(product -> product.getName().equals(name));
       System.out.println("Removed sucessfully.");
    }

    public static ProductManagement searchProduct(String name) {
        for (ProductManagement product : productManagements ) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        System.out.println("Product not found.");
        return null;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nId: " + id + "\nStockQuantity: " + stockQuantity + "\nPrice: " + price + "\nDescription: " + description;
    }




    
}



/*
 * Create a Product class with attributes like id, name, description, price, and stockQuantity.
Implement functionality to add, update, delete, and search for products.
 */
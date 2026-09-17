public class Product {
    // Create variables
    private String name;
    private double price;
    private int quantity;
    public boolean inStock;
    public char grade;

    // Add value for variables
    public Product() {
        this.name = "Unnamed product";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Import products from file Product.java
    public Product(String name, double price, int quantity, boolean inStock, char grade) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.inStock = inStock;
        this.grade = grade;
    }

    // Create Function getName() this is name of function
    public String  getName(){
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Invalid name - name was not changed.");
            return;
        }
        this.name = name;
    }


    // Create Function getPrice() this is name of function
    public double getPrice(){
        return price;
    }
    // Create function SetPrice for manage Price Add Setter Methods Add Validation Logic
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative - price was not changed.");
            return;
        }
        this.price = price;
    }

    public int getQuantity(int quantity){
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be negative - quantity was not changed.");
            return;
        }
        this.quantity = quantity;
    }

}

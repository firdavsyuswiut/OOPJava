public class Product {

    private String name;
    private double price;
    private int quantity;
    public boolean inStock;
    public char grade;

    public Product() {
        this.name = "Unnamed product";
        this.price = 0.0;
        this.quantity = 0;
    }
    // Create Function getName() this is name of function
    public String  getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

}

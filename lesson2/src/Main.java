//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product = new Product();
//        product.name = "Wireless Mousse";
//        product.price = 49.99;
//        product.quantity = 10;
        product.grade = 'A';
        product.inStock = true;


//        System.out.println("Name: " + product.getName());
//        System.out.println("Price: " + product.getPrice());
//        System.out.println("Quantity: " + product.getQuantity());
//        System.out.println("InStock: " + product.inStock);
//        System.out.println("Grade: " + product.grade);

        Product chair = new Product(
                "Arm chair",
                14.5,
                50,
                true,
                'A'
        );

        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        chair.setPrice(12.5);
        System.out.println("Price: " + product.getPrice());

    }
}
import java.util.HashMap;

public class Main {

    static void main(String[] args) {

     Inventory inventory = new Inventory();

     Product keyboard = new Product(1,"keyboard",10);
     Product mouse = new Product(2,"mouse",25);

     inventory.addProduct(keyboard);
     inventory.addProduct(mouse);

        System.out.println("Total of products: " + inventory.getProductCount());

        Product foundProduct = inventory.findProductById(1);

        if (foundProduct != null) {
            System.out.println("Found product: " + foundProduct.getName());
        } else  {
            System.out.println("Product not found");
        }

        Product missingProduct = inventory.findProductById(99);

        if (missingProduct == null) {
            System.out.println("Product not found");
        }

    }
}

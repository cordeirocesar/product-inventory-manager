import java.util.HashMap;

public class Main {

    static void main(String[] args) {

        HashMap<Integer, Product> inventory = new HashMap<>();

        Product keyboard = new Product(1,"Keyboard",10);
        Product mouse = new Product(2,"Mouse",25);

        inventory.put(keyboard.getId(), keyboard);
        inventory.put(mouse.getId(), mouse);

        System.out.println("Total of products: " + inventory.size());

        Product foundProduct = inventory.get(2);
        System.out.println("Found product: " + foundProduct.getName());

    }
}

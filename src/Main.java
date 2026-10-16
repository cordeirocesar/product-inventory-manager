public class Main {

    static void main(String[] args) {

     Inventory inventory = new Inventory();

     Product keyboard = new Product(1,"keyboard",10);
     Product mouse = new Product(2,"mouse",25);
     Product monitor = new Product(3,"monitor",150);
     Product anotherProduct = new Product(3,"gaming monitor",300);

     inventory.addProduct(keyboard);
     inventory.addProduct(mouse);


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

        boolean firstAdd = inventory.addProduct(monitor);
        System.out.println(firstAdd);

        boolean secondAdd = inventory.addProduct(anotherProduct);
        System.out.println(secondAdd);

        System.out.println(inventory.findProductById(3).getName());

        boolean updated = inventory.updateProduct(anotherProduct);
        System.out.println(updated);

        Product updatedProduct = inventory.findProductById(3);
        System.out.println(updatedProduct.getName());

        Product unknownProduct = new Product(99,"unknown",50);
        boolean missingUpdated = inventory.updateProduct(unknownProduct);
        System.out.println(missingUpdated);

        boolean removed =  inventory.removeProduct(2);
        System.out.println(removed);

        System.out.println(inventory.getProductCount());

        boolean removedAgain = inventory.removeProduct(2);
        System.out.println(removedAgain);

        Product removedProduct = inventory.findProductById(2);
        System.out.println(removedProduct == null);

        System.out.println("Products in inventory:");
        inventory.listProducts();


        System.out.println("Total of products: " + inventory.getProductCount());

        Product invalidId = new Product(0, "keyboard", 10);
        Product invalidName = new Product(4, "   ", 5);
        Product invalidQuantity = new Product(5, "mouse", -3);

        System.out.println(inventory.addProduct(invalidId));
        System.out.println(inventory.addProduct(invalidName));
        System.out.println(inventory.addProduct(invalidQuantity));
        System.out.println(inventory.addProduct(null));

        System.out.println("Total of products: " + inventory.getProductCount());
    }
}

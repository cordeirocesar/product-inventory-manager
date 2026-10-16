import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    public boolean addProduct(Product product) {
        if(!isValidProduct(product)) {
            return false;
        }
        if(products.containsKey(product.getId())) {
            return false;
        }
        products.put(product.getId(), product);
        return true;
    }

    public boolean updateProduct(Product product) {
        if(!isValidProduct(product)) {
            return false;
        }
        if(!products.containsKey(product.getId())) {
            System.out.println("Product does not exist");
            return false;
        }
        products.put(product.getId(), product);
        return true;

    }

    public boolean removeProduct(int id) {
        if(!products.containsKey(id)) {
            return false;
        }

        products.remove(id);
        return true;
    }

    public void listProducts() {

        if(products.isEmpty()) {
            System.out.println("No products found in inventory.");
            return;
        }
        for(Product product : products.values()) {
            System.out.println("Product ID: " + product.getId());
            System.out.println("Product Name: " + product.getName());
            System.out.println("Product Quantity: " + product.getQuantity());
        }
    }

    public Product findProductById(int id) {
        return products.get(id);
    }

    public int getProductCount() {
        return products.size();
    }

    private boolean isValidProduct(Product product) {
        if(product == null) {
            return false;
        } if(product.getId() <= 0){
            return false;
        } if(product.getName() == null || product.getName().isBlank()) {
            return false;
        } if(product.getQuantity() < 0) {
            return false;
        }
        return true;
    }
}

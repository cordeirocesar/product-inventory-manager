import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    public boolean addProduct(Product product) {
        if(products.containsKey(product.getId())) {
            return false;
        }
        products.put(product.getId(), product);
        return true;
    }

    public boolean updateProduct(Product product) {
        if(!products.containsKey(product.getId())) {
            return  false;
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
}

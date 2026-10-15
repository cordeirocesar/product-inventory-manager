import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product findProductById(int id) {
        return products.get(id);
    }

    public int getProductCount() {
        return products.size();
    }
}

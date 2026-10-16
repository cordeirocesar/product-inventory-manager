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

    public Product findProductById(int id) {
        return products.get(id);
    }

    public int getProductCount() {
        return products.size();
    }
}

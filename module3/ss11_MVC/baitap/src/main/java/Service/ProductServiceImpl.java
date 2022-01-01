package Service;

import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Nike", 200, "black-white", "Nike"));
        products.put(2, new Product(2, "Converse", 300, "black-white", "Converse"));
        products.put(3, new Product(3, "Bitis Hunter", 400, "black-white", "Bitis"));
        products.put(4, new Product(4, "Addidas", 500, "black-white", "Addidas"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        if (products.get(product.getId()) != null) {
            products.put(id, product);
        }
    }

    @Override
    public void remove(int id) {
        if (products.get(id) != null) {
            products.remove(id);
        }
    }

    @Override
    public Product findByName(String name) {
        List<Product> products = findAll();
        for (Product value : products) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        return null;
    }
}

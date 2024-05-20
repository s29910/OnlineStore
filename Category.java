import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Product> products;

    public Category() {
        this.name = "Default Category";
        this.products = new ArrayList<>();
    }

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = new ArrayList<>(products);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}

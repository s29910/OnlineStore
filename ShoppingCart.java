import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private User user;

    public ShoppingCart() {
        this.products = new ArrayList<>();
        this.user = null;
    }

    public ShoppingCart(User user) {
        this.products = new ArrayList<>();
        this.user = user;
    }

    public ShoppingCart(User user, List<Product> products) {
        this.user = user;
        this.products = new ArrayList<>(products);
    }

    public void addProduct(Product product) {
        if (product.getStock() > 0) {
            products.add(product);
            product.setStock(product.getStock() - 1);
        } else {
            throw new IllegalArgumentException("This product is out of stock");
        }
    }

    public void removeProduct(Product product) {
        if (products.remove(product)) {
            product.setStock(product.getStock() + 1);
        }
    }

    public double pay() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        products.clear(); //  payment clears the cart
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Product1", "fj6k4d", 10.0, 5);
        Product product2 = new Product("Product2", "djkg45", 15.0, 10);
        Product product3 = new Product("Product3", "dsfkh54", 20.0, 0); // Out of stock

        // Create categories
        Category category1 = new Category();
        Category category2 = new Category("Electronics");

        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        Category category3 = new Category("Groceries",  productList);

        // Add one product to each category
        category1.addProduct(product1);
        category2.addProduct(product2);
        category3.addProduct(product3); // Should show out of stock warning

        // Create users
        User user1 = new User("paul", "koskak", "user1@example.com", "wihg54d");
        User user2 = new User("user2@example.com");

        // Create shopping carts
        ShoppingCart cart1 = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart(user1);
        ShoppingCart cart3 = new ShoppingCart(user2, Arrays.asList(product1, product2));

        // Add products to carts
        cart1.addProduct(product1);
        cart1.addProduct(product2);

        cart2.addProduct(product1);
        //cart2.addProduct(product3); // exeption

        cart3.addProduct(product2);
        cart3.removeProduct(product1);

        // Pay for purchases
        System.out.println("Total for cart1: $" + cart1.pay());
        System.out.println("Total for cart2: $" + cart2.pay());
        System.out.println("Total for cart3: $" + cart3.pay());
    }
}

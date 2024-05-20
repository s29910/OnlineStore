public class Product {
    private String name;
    private double price;
    private String productCode;
    private int stock;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        if(productCode==null){
            throw new IllegalArgumentException("Production cod can not be less than zero");
        }
        this.productCode = productCode;
    }

    public Product(String name, String productCode, double price, int stock) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock<0){
            throw new IllegalArgumentException("Stock can not be less than zero");
        }
        this.stock = stock;
    }
}

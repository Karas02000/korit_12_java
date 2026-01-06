package ch12_inheritance.product;

public class Product extends Item {
    private int price;
    private int stock;

    public Product(String name, String category) {
        super(name, category);
    }
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}

package ch08_classes;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        Product product2 = new Product(987654);
        product2.productName = "다이소충전기";

        Product product3 = new Product("C");
        product3.productNum = 345678;

        Product product4 = new Product(456789,"D");

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }
}

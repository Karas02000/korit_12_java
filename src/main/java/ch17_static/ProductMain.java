package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println(Product.getTitle());
        // 객체 생성을 하지 않았지만, title 정적 변수를 불러올 수 있었다.
        Product product1 = new Product();
        product1.setName("아이스아메리카노");

        System.out.println(product1.getName());
        System.out.println(product1.getInstanceCnt());
        System.out.println(Product.getCnt());

        Product product2 = new Product();
        System.out.println(product2.getInstanceCnt());
        System.out.println(product2.getCnt());

        product2.increaseInstanceCnt();
        System.out.println(product2.getCnt());
    }
}

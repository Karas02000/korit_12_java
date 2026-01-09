package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println(Product.getTitle());
        // 객체 생성을 하지 않았지만, title 정적 변수를 불러올 수 있었다.
    }
}

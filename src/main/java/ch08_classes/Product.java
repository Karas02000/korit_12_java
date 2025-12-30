package ch08_classes;
/*

 */

public class Product {
    int productNum;
    String productName;
    public Product(){

    }
    public Product(int productNum){
        this.productNum=productNum;
    }
    public Product(String productName){
        this.productName = productName;
    }
    public Product(int productNum, String productName){
        this.productNum=productNum;
        this.productName=productName;
    }

    public void showInfo(){
        System.out.println("제품번호 : "+ productNum);
        System.out.println("제품명 : "+ productName);
    }
}

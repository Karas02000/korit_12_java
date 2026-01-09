package ch15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        String example1 = "안녕하세요";
        String example2 = new  String("안녕하세요");
        boolean exResult1 = "안녕하세요" == example2;
        boolean exResult2 = example1 == example2;
        boolean exResult3 = example1.equals(example2);

        System.out.println(exResult1);
        System.out.println(exResult2);
        System.out.println(exResult3);
    }
}

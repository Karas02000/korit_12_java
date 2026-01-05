package ch11_arrays;

public class Array09EnhancedFor {
    public static void main(String[] args) {
        String[] names = {"김일","김이","김삼","김사","김오"};
        for(String name : names) {
            System.out.print(name+ "\t\t");
        }
    }
}

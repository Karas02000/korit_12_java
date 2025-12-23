package ch06_loops;

public class Loop02While {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 100){
            System.out.printf("%d\t",num);
            if(num%10==0){
                System.out.println();
            }
            num++;
        }

        System.out.println();

        int num1 = 0;
        int num2 = 1;

        while(num1 < 10){
            while(num2 <= 10){
                System.out.printf("%d\t",num1*10+num2);
                num2++;
            }
            System.out.println();
            num1++;
            num2=1;
        }

        System.out.println();

        int num3 = 0;


        while(num3 < 100){
            int n=1;
            while(n<=10){
                System.out.print(num3+n + "\t");
                n++;
            }
            num3+=10;
            System.out.println();
        }
    }
}

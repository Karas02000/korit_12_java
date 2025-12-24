package ch06_loops;

public class Loop04For {
    public static void main(String[] args) {
        int sum1=0;

        for(int i=1 ; i <=100 ; i++){
            sum1+=i;
        }
        System.out.println(sum1);

        int sum2=0;
        int i=1;

        while(i<=100){
            sum2+=i;
            i++;
        }
        System.out.println(sum2);

        int num = 100;
        int result = (num*(num+1))/2;
        System.out.println(result);
    }
}

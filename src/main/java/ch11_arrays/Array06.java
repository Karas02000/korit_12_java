package ch11_arrays;

public class Array06 {
    public static double calcSum(int[] arr) {
        double sum=0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }
    public static double calcAvg(double sum, int len) {
        double avg = sum / len;
        return avg;
    }
    public static void printArr2SumAndAvg(int[] arr) {
        double sum = calcSum(arr);
        double avg = calcAvg(sum, arr.length);

        System.out.println("합계 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
    }
    public static void main(String[] args) {
        int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        printArr2SumAndAvg(scores);
    }
}

package ch11_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array15Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNum = new int[6];

        lottoNum[0] = random.nextInt(1, 46);

        for(int i=0 ; i<6 ; i++) {
            boolean isHave;
            do {
                isHave = false;
                int temp = random.nextInt(1, 46);

                for (int j = 0; j < i; j++) {
                    if (lottoNum[j] == temp) {
                        isHave = true;
                    } else if (j == i-1) {
                        lottoNum[i] = temp;
                    }
                }
            }while(isHave);

            System.out.println(Arrays.toString(lottoNum));
        }
        Arrays.sort(lottoNum);
        System.out.println(Arrays.toString(lottoNum));
    }
}

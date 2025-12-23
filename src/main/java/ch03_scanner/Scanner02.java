package ch03_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요. >> ");
        int age = sc.nextInt();
        System.out.println("저는 올해 "+age+"살입니다.");
        System.out.println("내년에는 "+(age+1)+"살이 됩니다.");
    }
}

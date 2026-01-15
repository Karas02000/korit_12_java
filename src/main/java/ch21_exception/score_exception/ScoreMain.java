package ch21_exception.score_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreMain {
    public static void checkScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("점수는 0~100점 사이여야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("점수를 입력하여 주세요. >>> ");
            int score = sc.nextInt();
            sc.nextLine();
            checkScore(score);
            System.out.println("점수가 성공적으로 저장되었습니다.");
        } catch(InvalidScoreException e) {
            System.out.println("입력 오류 : " + e.getMessage());
        } catch(InputMismatchException e){
            System.out.println("입력 오류 : " + e.getMessage());
            System.out.println("정수만 입력할 수 있습니다.");
        } catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("예기치못한 문제가 발생하였습다.");
        }
    }
}

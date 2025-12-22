package ch00_starting;

public class Main {
    /*
        주석(comment) : Java 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링 하는데, 거기서 오류가 하나라도 발생하게 되면 전체 프로그램 실행이 되지 않는다.
                       하지만 주석처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에 오류가 발생하지 않습니다.

     */
    public static void main(String[] args) {
        int scoreEnglish = 100;
        int scoreKorean = 75;
        System.out.println("영어 점수 : " + scoreEnglish);
        System.out.println("국어 점수(수정전) : " + scoreKorean);
        scoreKorean = 90;
        System.out.println("국어점수(수정후) : " + scoreKorean);
    }
}

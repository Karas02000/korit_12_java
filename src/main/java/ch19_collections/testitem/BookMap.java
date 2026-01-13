package ch19_collections.testitem;

import java.util.*;

/*
    서점에서 판매하는 책 재고를 관리하는 프로그램
    지시 사항
    1. Map을 사용하여 도서명(String)을 key로, 재고를 Integer로 하여 value로 사용
    2. 사용자로부터 새 도서명과 수량을 입력 받아서 Map에 추가.
        - 이미 존재하는 도서라면 "이미 재고에 있는 도서입니다." 출력
    3. 사용자로부터 수량을 변경할 도서명과 새로운 재고 수량을 입력 받아 Map의 값을 '수정'
        - 존재하지 않는 도서라면 "해당 도서가 재고에 없습니다." 출력
    4. Map에 있는 모든 도서명과 재고 수량을 출력하도록 작성.

    실행 예
    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 1
    새 도서명을 입력하세요 >>> 자바의 정석
    재고 수량을 입력하세요 >>> 10
    자바의 정석 도서가 10 권 추가되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 2
    재고를 변경할 도서명을 입력하세요 >>> 자바의 정석
    새로운 재고 수량을 입력하세요 >>> 9
    자바의 정석 도서가 9 권으로 변경되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 3
    --- 현재 재고 목록 ---
    도서명 : 자바의 정석, 재고 수량 : 9 권
    도서명 : python의 정석, 재고 수량 : 1 권

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 4
    프로그램을 종료합니다.
 */
public class BookMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> bookMap = new HashMap<String, Integer>();
        int choice = 0;
        String title;
        int stock;

        while (true) {
            System.out.println();
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println(
                    "1. 도서 추가\n" +
                    "2. 재고 수정\n" +
                    "3. 재고 목록\n" +
                    "4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice<1 || choice >4){
                break;
            }else if (choice == 1) {
                System.out.print("새 도서명을 입력하세요 >>> ");
                title = sc.nextLine();
                System.out.print("재고 수량을 입력하세요 >>> ");
                stock = sc.nextInt();
                sc.nextLine();

                if(!bookMap.containsKey(title)){
                    bookMap.put(title,stock);
                    System.out.println(title+" 도서가 "+stock+" 권 추가되었습니다.");
                }else{
                    System.out.println("이미 재고에 있는 도서입니다.");
                }
            }else if (choice == 2) {
                System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
                title = sc.nextLine();
                System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                stock = sc.nextInt();
                sc.nextLine();

                if(bookMap.containsKey(title)){
                    bookMap.replace(title,stock);
                    System.out.println(title+" 도서가 "+stock+" 권으로 변경되었습니다.");
                }else{
                    System.out.println("해당 도서가 재고에 없습니다.");
                }
            }else if (choice == 3) {
                System.out.println("--- 현재 재고 목록 ---");
                for(String book : bookMap.keySet()){
                    System.out.println("도서명 : "+book+", 재고 수량 : "+bookMap.get(book)+" 권");
                }
            }else if (choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}

package ch19_collections.testitem;

import java.util.*;

public class BookMap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> bookInventory = new HashMap<>();
        bookInventory.put("Java프로그래밍",2);

        boolean endOfProgram = false;
        while (!endOfProgram) {
            System.out.println("---- 도서 재고 관리 프로그램 ----");
            System.out.println("1. 도서 추가\n2. 재고 입고\n3. 재고 출고\n4. 재고 목록\n5. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = sc.nextInt();
            sc.nextLine();

            String bookTitle;
            Integer bookStocks;
            switch (option) {
                case 1:
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    bookTitle = sc.nextLine();
                    if(bookInventory.containsKey(bookTitle)){
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.print("도서의 재고를 입력하세요 >>> ");
                        bookStocks = sc.nextInt();
                        sc.nextLine();
                        bookInventory.put(bookTitle, bookStocks);
                        System.out.println(bookTitle + " 도서가 " +  bookStocks + "만큼 추가되었습니다.");
                    }
                    break;
                case 2:
                    System.out.print("수정할 도서명을 입력하세요 >>> ");
                    bookTitle = sc.nextLine();
                    if(bookInventory.containsKey(bookTitle)){
                        System.out.print("도서의 입고할 재고를 입력하세요 >>> ");
                        bookStocks = sc.nextInt();
                        sc.nextLine();

                        int temp = bookStocks * bookStocks;
                        bookStocks = temp/bookStocks;

                        bookInventory.replace(bookTitle, bookInventory.get(bookTitle) + bookStocks);
                        System.out.println(bookTitle + " 도서가 " +  bookStocks + "권 만큼 추가 입고되었습니다.");
                    } else {
                        System.out.println("목록에 존재하지 않는 도서입니다.");
                    }
                    break;
                case 3:
                    System.out.print("수정할 도서명을 입력하세요 >>> ");
                    bookTitle = sc.nextLine();
                    if(bookInventory.containsKey(bookTitle)){
                        System.out.print("도서의 출고할 재고를 입력하세요 >>> ");
                        bookStocks = sc.nextInt();
                        sc.nextLine();

                        int temp = bookStocks * bookStocks;
                        bookStocks = temp/bookStocks;
                        if (bookStocks <= bookInventory.get(bookTitle)) {
                            bookInventory.replace(bookTitle, bookInventory.get(bookTitle) - bookStocks);
                            System.out.println(bookTitle + " 도서가 " + bookStocks + "만큼 출고되었습니다.");
                        }else {
                            System.out.println(bookTitle + "의 재고가 " + bookStocks + "권이 되지 않습니다.\n현재 "+bookTitle+"의 재고 : " + bookInventory.get(bookTitle) + "권");
                        }
                    } else {
                        System.out.println("목록에 존재하지 않는 도서입니다.");
                    }
                    break;
                case 4:
                    Set<String> bookTitleSet = bookInventory.keySet();
                    List<String> bookTitleKey = new ArrayList<>();
                    bookTitleKey.addAll(bookTitleSet);

                    System.out.println();
                    System.out.println("---- 도서 재고 현황 목록 ----");
                    for( String book :  bookTitleKey){
                        System.out.println("도서명 : " + book + ", 현재 재고 : " + bookInventory.get(book)+"권");
                    }
                    System.out.println("---------------------------");
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}

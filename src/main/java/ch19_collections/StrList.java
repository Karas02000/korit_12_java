package ch19_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        // Array와의 차이점 #1
        // 선언 방식
        String[] strArray = new String[5];
        List<String> strList = new ArrayList<String>();

        // Array와의 차이점 #2
        // 값의 대입 방법
        strArray[0] = "김영";
        strArray[4] = "김사";

        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Python");
        strList.add("C");
        strList.add("C++");
        // List는 크기가 고정되지 않았기 때문에 값의 대입에 그 제한이 존재하지 않는 부분도 Array와의 차이점


        // Array와의 차이점 #3
        // 출력 방법
        System.out.println(Arrays.toString(strArray));
        System.out.println(strList);

        // Array와의 차이점 #4
        // 삭제 방법
        strArray[0] = null;
        String remouveElem1 = "JavaScript";
        boolean isRemoved = strList.remove(remouveElem1);
        System.out.println(Arrays.toString(strArray));
        System.out.println(strList);
        // 현재의 상황의 차이점의 경우, Array는 null값의 대입이기 때문에 index는 여전히 5개이다.
        // 하지만 List의 경우, 해당값이 있는 index 자체를 지우기에 index 자체가 4개로 줄어있다.

        // 배열 방식
        Collections.sort(strList);
        System.out.println(strList);

        Collections.sort(strList, Collections.reverseOrder());
        System.out.println(strList);


        String searchElem1 = "Python";
        boolean contains1 = strList.contains(searchElem1);
        System.out.println(searchElem1 + " 포함 여부 : " + contains1);

        String searchElem2 = "py";
        boolean contains2 = strList.contains(searchElem2);
        System.out.println(searchElem2 + " 포함 여부 : " + contains2);

        for(int i = 0; i < strArray.length; i++){
            strArray[i] = "김"+Integer.toString(i);
        }
        for (String str : strArray) {
            System.out.print(str + " 님 / ");
        }

        System.out.println();

        // list는 index 추출할 떄 리스트명.size() 를 씁니다. .length 아니고, method의 구조임을 유의할 것

        for (int i=0 ; i<strList.size(); i++){
            System.out.print(strList.get(i) + " 언어 / ");
        }
        System.out.println();
        for(String str : strList){
            System.out.print(str + " 공부 / ");
        }
    }
}

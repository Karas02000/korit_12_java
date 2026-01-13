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

        strList.add("C");
        strList.add("C#");
        strList.add("C++");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Python");
        // List는 크기가 고정되지 않았기 때문에 값의 대입에 그 제한이 존재하지 않는 부분도 Array와의 차이점
    }
}

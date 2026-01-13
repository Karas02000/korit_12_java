package ch19_collections;

import java.util.*;

/*
    List는 순서가 있고 중복 허용
    Set은 순서는 없고 중복은 허용하지 않기 떄문에
    List -> Set 혹은 Set -> List로의 형변환이 중요하다.
    예를 들어 List로 전체 설문을 받고, Set을 통해 중복을 제거하여 후보군만 남기는 등의 형태로 사용할 수 있다.
    또한 Set으로 중복을 제거한 후에 다시 List로 돌려 .get(index)로 조회도 할 수 있다.

    Set은 수학적 집합의 개념과 유사하지만, 차이점은 수학적 집합과 달리 여러 자료형을 허용하는 정도이다.
 */
public class strSet {
    public static void main(String[] args) {
        // Set 생성
        Set<String> strSet = new HashSet<>();
        // List 생성
        List<String> strList = new ArrayList<>();

        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Java");
        strList.add("JavaScript");
        strList.add("Java");
        strList.add("JavaScript");

        System.out.println(strList);

        strSet.addAll(strList);
        System.out.println(strSet);

        for(String elem : strSet){
            System.out.println(elem);
        }
//        for (int i=0 ; i<strSet.size() ; i++){
//            System.out.println(strSet.get(i));
//        }

        List<String> modifiedList = new ArrayList<>();
        modifiedList.addAll(strSet);
        System.out.println(modifiedList);
    }
}

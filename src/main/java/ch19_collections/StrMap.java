package ch19_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] agrs){//Map의 선언 및 초기화
        Map<String, String> strMap1 = new HashMap<String, String>();

        strMap1.put("kor2026001","김일");
        strMap1.put("kor2026002","김이");
        strMap1.put("kor2026003","김삼");
        strMap1.put("kor2026004","김사");
        strMap1.put("kor2026005","김오");
        System.out.println(strMap1);


        strMap1.put("kor2026005","KimFive");
        System.out.println(strMap1);

        Map<String,double[]> koreanScores1 = new HashMap<>();
        koreanScores1.put("김일",new double[4]);

        Map<String,Double> koreanScores2 = new HashMap<>();
        koreanScores2.put("김이", 11.4);
        koreanScores2.put("김일", 3.8);
        koreanScores2.put("김삼", 4.4);
        koreanScores2.put("김사", 1.7);
        koreanScores2.put("김오", 7.2);
        koreanScores2.replace("김오", 11.4);

        System.out.println(koreanScores2);

        // .containsKey() -> boolean
        boolean searchKeyFlag1 = strMap1.containsKey("kor2026001");
        System.out.println("kor2026001 존재 여부 : "+searchKeyFlag1);

        boolean searchKeyFlag2 = strMap1.containsValue("김삼");
        System.out.println(strMap1.get("kor2026003") + "의 존재 여부 :  "+searchKeyFlag2);

        Set<Map.Entry<String,String>> entrySet1 = new HashSet<>();
        // 이상의 코드는 set 하나 생성하는데, 내부의 Key가 String, Value가 Stirng인 Map이 Set의 각각의 element에 해당한다는 것을 의미한다.

        Set<Map.Entry<String,String>> entrySet2 = strMap1.entrySet();
        // strMap1의 자료형은 당연히 Map일텐데 .entrySet()의 호출 결과가 Set<Map.Entry<String,String>>으로
        // 자동완성 된 이유는 저희가 그렇게 선언했기 떄문입니다. -> intellij support에 해당함.
        // 그럼 이제 우리 수준에서는 strMap1.entrySet()의 호출결과가 일종의 형변환이 이루어진 로직이 있고
        // 해당 자료형으로 return해서 entrySet2라는 객체에 데이터를 담았다고 해석할 수 있겠습니다.
        System.out.println(entrySet2);

        // 근데 Map을 Set으로 바꿨다면 아까 학습한 내용을 토대로 봤을 때 Set -> List로 형변환할 수 있다.
//        List<Map.Entry<String,String>> entryList1 = strMap1.
        // 이 위를 보니 되지 않으니 Set을 경유해서 실험해보자.

        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);

//        Set<String> valueSet = strMap1.values();

        Collection<String> values = strMap1.values();
        System.out.println(values);
    }
}

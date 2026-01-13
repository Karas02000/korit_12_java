package ch19_collections;

import java.util.HashMap;
import java.util.Map;

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
    }
}

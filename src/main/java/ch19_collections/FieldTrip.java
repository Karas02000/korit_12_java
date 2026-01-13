package ch19_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> fieldTrips = new ArrayList<String>();

        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? ");
        int students = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < students; i++){
            System.out.print(i+1 + "번 학생의 수학 여행지를 입력하세요 >>> ");
            fieldTrips.add(sc.nextLine());
        }
        System.out.println();
        int i = 1;
        for(String elem : fieldTrips){
            System.out.println((i++) + " 번 학생의 후보지 : " + elem);
        }
        System.out.println();
        Set<String> fieldSet = new HashSet<String>(fieldTrips);
        fieldSet.addAll(fieldTrips);
        List<String> modifiedList = new ArrayList<String>();
        modifiedList.addAll(fieldSet);

        System.out.println("수학 여행 후보지는");
        for(String elem : modifiedList){
            System.out.println(elem);
        }
        System.out.println("입니다.");
    }
}

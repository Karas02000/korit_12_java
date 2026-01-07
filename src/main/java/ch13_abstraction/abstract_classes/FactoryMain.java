package ch13_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성을 '원래는' 못한다.
        Factory factory1 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ " + model + " ] 을(를) 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 관리합니다.");
            }
        };

        factory1.setName("임시 공장");              // 본래 객체 생성을 못하는데 Factory 객체가 생성되었고,
        factory1.produce("모니터");           // method 호출도 된다는 점이 문제입니다.

        /*
            이상의 개념은 익명 클래스로 Java1.1 -> 근데 이 형식은 자주 쓰인다기 보다 추후 학습할 람다식(Lambda Expression)으로 대체되는 경우가 많다.

            재사용하지 않고 한 번만, 즉 이 경우에는 FactoryMain에서만 한 번 쓰고 치운다면 사용하기 좋다.

            지금은 교육상황이기 떄문에 모든 클래스를 한 번 정의하고 그걸로 객체 한 두 개 만들고, 치우는 경우가 많아서 모든 수업을 위처럼 익명 클래스로 정의할 수도 있지만
            기본적으로 여러 프로그램에서 동시에 쓸 객체가 아닌 경우, 익명
         */

        // PhoneFactory 객체 생성
        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 아이폰 공장");
        phoneFactory1.produce("아이폰 에어2");
        phoneFactory1.manage();

        phoneFactory1.showInfo();
    }
}

package ch13_abstraction.abstract_classes;

public class PhoneFactory extends Factory {
    @Override
    public void produce(String model) {
        showInfo();
        System.out.println("모바일폰 공장 : " + this.getName() + "에서 [ " + model + " ] 을(를) 만듭니다.");
    }

    @Override
    public void manage() {

    }
}

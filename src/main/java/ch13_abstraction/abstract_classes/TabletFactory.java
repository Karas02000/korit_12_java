package ch13_abstraction.abstract_classes;

public class TabletFactory extends Factory {
    public TabletFactory() {}
    public TabletFactory(String name) {
        this.setName(name);
    }
    @Override
    public void produce(String model) {

    }

    @Override
    public void manage() {
        System.out.println(getName() + " 을 관리합니다.");
    }

    public void upgrade(String model) {
        System.out.println(model + "로 업그레이드 합니다.");
    }
}

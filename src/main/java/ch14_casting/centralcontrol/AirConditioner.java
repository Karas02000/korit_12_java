package ch14_casting.centralcontrol;

public class AirConditioner implements Power {
    public void on() {
        System.out.println("에어컨이 켜졌습니다.");
    }
    public void off() {
        System.out.println("에어컨이 꺼졌습니다.");
    }
    public void changeMode() {
        System.out.println("에어컨의 모드를 변경합니다.");
    }
}

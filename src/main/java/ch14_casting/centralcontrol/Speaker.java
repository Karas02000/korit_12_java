package ch14_casting.centralcontrol;

public class Speaker implements Power {
    @Override
    public void on() {
        System.out.println("스피커가 연결됩니다.");
    }
    @Override
    public void off() {
        System.out.println("스피커 연결이 끊어집니다.");
    }
    public void changeEqual() {
        System.out.println("스피커의 이퀄라이저를 변경합니다.");
    }
}

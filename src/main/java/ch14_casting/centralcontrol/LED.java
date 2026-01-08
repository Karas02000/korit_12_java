package ch14_casting.centralcontrol;

public class LED implements Power {
    @Override
    public void on() {
        System.out.println("불이 켜집니다.");
    }
    @Override
    public void off() {
        System.out.println("불이 꺼집니다.");
    }
}

package ch14_casting.centralcontrol;

public class Computer implements Power {
    public void on() {
        System.out.println("컴퓨터가 켜집니다.");
    }
    public void off() {
        System.out.println("컴퓨터가 꺼집니다.");
    }
}

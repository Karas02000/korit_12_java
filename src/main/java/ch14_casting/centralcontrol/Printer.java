package ch14_casting.centralcontrol;

public class Printer implements Power {
    @Override
    public void on() {
        System.out.println("프린터기가 켜집니다.");
    }

    @Override
    public void off() {
        System.out.println("프린터기가 꺼집니다.");
    }
    public void doPrint() {
        System.out.println("프린터가 인쇄를 합니다.");
    }
}

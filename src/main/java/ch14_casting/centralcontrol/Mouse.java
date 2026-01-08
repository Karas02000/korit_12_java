package ch14_casting.centralcontrol;

import java.awt.event.MouseListener;

public class Mouse implements Power {
    @Override
    public void on() {
        System.out.println("마우스가 연결되었습니다.");
    }
    @Override
    public void off() {
        System.out.println("마우스 연결이 끊어졌습니다.");
    }
}

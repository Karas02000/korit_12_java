package ch13_abstraction.abstract_classes.interfaces;

public class DownButton extends  Button {
    public void onPressed(){
        System.out.println("온도를 한 칸 내립니다.");
    }
    @Override
    public void onDown() {
        System.out.println("계속 온도를 내립니다.");
    }
}

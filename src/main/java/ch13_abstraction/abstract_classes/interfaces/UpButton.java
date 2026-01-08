package ch13_abstraction.abstract_classes.interfaces;

public class UpButton extends Button {
    public void onPressed() {
        System.out.println("온도를 한 칸 올립니다.");
    }
    @Override
    public String onUp() {
        return "온도를 " + super.onUp();
    }
}

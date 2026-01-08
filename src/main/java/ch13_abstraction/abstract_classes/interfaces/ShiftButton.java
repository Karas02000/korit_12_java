package ch13_abstraction.abstract_classes.interfaces;

public class ShiftButton extends Button {
    private boolean CorH = true;
    @Override
    public void onPressed() {
        if(CorH){
            System.out.println("난방으로 바뀝니다.");
            CorH = !CorH;
        } else {
            System.out.println("냉방으로 바뀝니다.");
            CorH = !CorH;
        }
    }
}

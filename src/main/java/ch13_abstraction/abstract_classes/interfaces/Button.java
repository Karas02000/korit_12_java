package ch13_abstraction.abstract_classes.interfaces;

public abstract class Button implements Press, Up, Down {
    @Override
    public abstract void onPressed();
    @Override
    public String onUp() {
        return "";
    }
    @Override
    public void onDown() {

    }

}

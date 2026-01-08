package ch13_abstraction.abstract_classes.interfaces;

public class AirConditionerController {
    private PowerButton powerButton;
    private DownButton downButton;
    private UpButton upButton;
    private ShiftButton shiftButton;
    //-------------------------------------------------------------------
    public PowerButton getPowerButton() {
        return powerButton;
    }
    //-------------------------------------------------------------------
    public void setDownButton(DownButton downButton) {
        this.downButton = downButton;
    }
    public void setUpButton(UpButton upButton) {
        this.upButton = upButton;
    }
    //-------------------------------------------------------------------
    public DownButton getDownButton() {
        return downButton;
    }
    public UpButton getUpButton() {
        return upButton;
    }
    //-------------------------------------------------------------------
    public AirConditionerController(){}
    public AirConditionerController(
            PowerButton powerButton,
            DownButton downButton,
            UpButton upButton,
            ShiftButton shiftButton
    ){
        this.powerButton = powerButton;
        this.downButton = downButton;
        this.upButton = upButton;
        this.shiftButton = shiftButton;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    public void onPowerButtonPress(){
        powerButton.onPressed();
    }
    public void onDownBUttonPress(){
        downButton.onPressed();
    }
    public void onUpButtonPress(){
        upButton.onPressed();
    }
    public void onDownButtonDown(){
        downButton.onDown();
    }
    public void onUpButtonUp(){
        System.out.println(upButton.onUp());
    }
    public void onShiftButtonPress(){
        shiftButton.onPressed();
    }

}

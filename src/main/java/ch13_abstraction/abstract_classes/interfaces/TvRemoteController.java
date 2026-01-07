package ch13_abstraction.abstract_classes.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;

    public TvRemoteController() {System.out.println("TV 리모컨 객체가 생성되었습니다.");}
    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        System.out.println("TV 리모컨 객체가 생성되었습니다.");
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }


    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton() {
        System.out.println(channelUpButton.onUp());
    }
}

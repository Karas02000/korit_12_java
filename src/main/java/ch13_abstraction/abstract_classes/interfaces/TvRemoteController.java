package ch13_abstraction.abstract_classes.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController() {System.out.println("TV 리모컨 객체가 생성되었습니다.");}
    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton  = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
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

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton() {
        System.out.println(volumeUpButton.onUp());
    }
}

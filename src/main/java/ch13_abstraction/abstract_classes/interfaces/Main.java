package ch13_abstraction.abstract_classes.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        PowerButton pb = new PowerButton();
//        ChannelDownButton cd = new ChannelDownButton();
//        ChannelUpButton cu = new ChannelUpButton();
//        pb.onPressed();

        /*
                버튼들을 만들어서 Main에서 객체 생성을 한 후에 메서드를 호출하는 것은 가능합니다.
                그런데 Main에서 매번 객체를 생성해줘야하는 문제가 있습니다.
         */
        TvRemoteController tc = new TvRemoteController(
                new PowerButton(),
                new ChannelUpButton(),
                new ChannelDownButton()
        );

        /*
            리모컨 객체의 argument로 PowerButton 생성자를 집어넣었습니다.
            생성자의 정의는 객체를 생성할때 호출되는 특수한 메서드 이므로,
            new PowerButton(), 을 통해 객체가 생성되었다고 볼 수 있다.
            하지만 객체명을 달리 가지진 않은 상태이다.

            this.powerButton = powerButton이라고 되어있습니다.
            그 말은 argument로 들어온 new PowerButton()이 매개변수인 PowerButton powerButton으로 치환되고,
            그것이 TvRemoteController의 field인 powerButton에 대입된다는 것을 확인할 수 있다.
         */
        tc.onPressedPowerButton();

        tc.onPressedChannelDownButton();
        tc.onDownChannelDownButton();
        tc.onPressedChannelUpButton();
        tc.onUpChannelUpButton();

        tc.onPressedPowerButton();
    }
}

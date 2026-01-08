package ch14_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        AirConditioner airConditioner1 =  new AirConditioner();
        Computer computer1 = new Computer();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();
        Speaker speaker1 = new Speaker();

        CentralControl centralControl1 = new CentralControl(new Power[6]);

        try{
            centralControl1.addDevice(computer1);
            centralControl1.addDevice(airConditioner1);
            centralControl1.addDevice(led1);
            centralControl1.addDevice(printer1);
            centralControl1.addDevice(mouse1);
            centralControl1.addDevice(speaker1);
        }catch(Exception e){
            System.out.println();
        }

        centralControl1.powerOn();
        System.out.println();
        centralControl1.powerOff();
        System.out.println();
        centralControl1.showInfo();
        System.out.println();
        centralControl1.performSpecificMethod();
        System.out.println();
        centralControl1.deleteAllDevice("LED",2);
        System.out.println();
        centralControl1.showInfo();

    }
}

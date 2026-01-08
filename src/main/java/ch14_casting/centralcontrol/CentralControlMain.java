package ch14_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        AirConditioner airConditioner1 =  new AirConditioner();
        Computer computer1 = new Computer();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();

        Power[] deviceArray = {
                new AirConditioner(),
                new Computer(),
                new Mouse(),
                new LED()
        };
        CentralControl centralControl1 = new CentralControl(new Power[6]);

        try{
            centralControl1.addDevice(airConditioner1);
            centralControl1.addDevice(computer1);
            centralControl1.addDevice(mouse1);
            centralControl1.addDevice(led1);
            centralControl1.addDevice(led1);
            centralControl1.addDevice(led1);
        }catch(Exception e){
            System.out.println();
        }

        centralControl1.powerOn();
        centralControl1.powerOff();
    }
}

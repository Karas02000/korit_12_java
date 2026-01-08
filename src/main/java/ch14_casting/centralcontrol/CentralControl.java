package ch14_casting.centralcontrol;

public class CentralControl {
    Power[] deviceArray;
    CentralControl(Power[]powers) {
        this.deviceArray = powers ;
    }

    public void addDevice(Power device) {
        if (checkEmpty() == -1) {
            System.out.println("더이상 장치를 연결할 수 없습니다.");
        }
        deviceArray[checkEmpty()] = device;
        System.out.println(device.getClass().getSimpleName());


    }

    // 비어있는 인덳를 굳이 외부로 노출할 필요는 없기에
    private int checkEmpty() {
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) return i;
        }
        return -1;
    }

    public void powerOn(){
        int index = 0;
        for(Power power: deviceArray){
            System.out.print("슬롯 [" + (++index) + "] 번 : ");
            if(power == null){
                System.out.println("장치가 없어 실행하지 못했습니다.");
                return;
            }
            power.on();
        }
    }
    public void powerOff(){
        int index = 0;
        for(Power power: deviceArray){
            System.out.print("슬롯 [" + (++index) + "] 번 : ");
            if(power == null){
                System.out.println("장치가 없어 실행하지 못했습니다.");
                return;
            }
            power.off();
        }
    }

    public void showInfo() {
        for(int i =0 ; i< deviceArray.length; i++){
            if (deviceArray[i] == null) {
                System.out.println("슬롯 [" + (i+1) +  "] 번 : Empty");
                continue;
            }
            System.out.println("슬롯 [" + (i+1) +  "] 번 : " + deviceArray[i].getClass().getSimpleName());
        }
    }

    public void performSpecificMethod() {
        for(int i =0 ; i< deviceArray.length; i++){
            if (deviceArray[i] == null) {
                System.out.println("슬롯 [" + (i+1) + "] 번 : Empty");
            } else if (deviceArray[i] instanceof Computer) {
                System.out.print("슬롯 [" + (i+1) + "] 번 : ");
                ((Computer)deviceArray[i]).clac();
            } else if (deviceArray[i] instanceof AirConditioner) {
                System.out.print("슬롯 [" + (i+1) + "] 번 : ");
                ((AirConditioner) deviceArray[i]).changeMode();
            } else if (deviceArray[i] instanceof Mouse) {
                System.out.print("슬롯 [" + (i+1) + "] 번 : ");
                ((Mouse)deviceArray[i]).clicked();
            } else if (deviceArray[i] instanceof LED) {
                System.out.print("슬롯 [" + (i+1) + "] 번 : ");
                ((LED)deviceArray[i]).mosSign();
            } else if (deviceArray[i] instanceof Printer) {
                System.out.print("슬롯 [" + (i+1) + "] 번 : ");
                ((Printer)deviceArray[i]).doPrint();
            } else if (deviceArray[i] instanceof Speaker) {
                System.out.print("슬롯 [" + (i+1) + "] 번 : ");
                ((Speaker)deviceArray[i]).changeEqual();
            }
        }
    }

    public void deleteAllDevice(String deviceName, int howMany) {
        int count = howMany;
        for(int i=0 ; i<deviceArray.length; i++){
            if(deviceArray[i].getClass().getSimpleName().equals(deviceName) && deviceArray[i] != null){
                deviceArray[i] = null;
                System.out.println("슬롯 [" + (i+1) + "] 번 : " + deviceName + "가(이) 삭제되었습니다.");
                count--;
            }
        }
        if (howMany != 0) {
            System.out.println(deviceName + " " +count + "개 를 연결된 디바이스에서 찾지 못했습니다.");
            System.out.println("총 " + (howMany - count) + "개의 " + deviceName + "을(를) 삭제했습니다.");
        }
    }
}

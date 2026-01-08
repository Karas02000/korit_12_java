package ch14_casting.centralcontrol;

public class CentralControl {
    Power[] deviceArray = new Power[7];
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
        for(Power power: deviceArray){
            if(power == null){
                System.out.println("장치가 없어 실행하지 못했습니다.");
                return;
            }
            power.on();
        }
    }
    public void powerOff(){
        for(Power power: deviceArray){
            if(power == null){
                System.out.println("장치가 없어 실행하지 못했습니다.");
                return;
            }
            power.off();
        }
    }
}

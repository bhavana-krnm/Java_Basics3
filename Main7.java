interface SmartDevice{
    abstract void connectWifi();

    default void deviceStatus(){
        System.out.println("Smart device is ready");
    }
}

class SmartTV implements SmartDevice{
    public void connectWifi(){
        System.out.println("Smart TV connected to WiFi");
    }
}

class SmartWatch implements SmartDevice{
    public void connectWifi(){
        System.out.println("Smart Watch connected to WiFi");
    }
}

public class Main7{
    public static void main(String[] args){
        SmartDevice d1 = new SmartTV();
        SmartDevice d2 = new SmartWatch();
        d1.connectWifi();
        d1.deviceStatus();
        d2.connectWifi();
        d2.deviceStatus();
    }
}
interface Alert{
    void sendAlert(String message);
}
class EmailAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Email Alert:" +message);
    }
}
class MobileAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Mobile Alert:" +message);
    }
}

public class Main5{
    public static void main(String[] args){
        Alert a=new EmailAlert();
        Alert b=new MobileAlert();
        a.sendAlert("Login successful");
        b.sendAlert("Low battery");
    }
}
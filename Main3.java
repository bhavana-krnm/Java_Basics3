abstract class Delivery{
    void acceptOrder(){
        System.out.println("Delivery order accepted");
    }
    abstract void deliverProduct();
}
class FoodDelivery extends Delivery{
    void deliverProduct(){
        System.out.println("Food order delivered to customer");
    }
}
class ParcelDelivery extends Delivery{
    void deliverProduct(){
        System.out.println("Parcel delivered successfully");
    }
}

public class Main3{
    public static void main(String[] args){
        FoodDelivery f=new FoodDelivery();
        ParcelDelivery p=new ParcelDelivery();
        f.acceptOrder();
        f.deliverProduct();
        p.acceptOrder();
        p.deliverProduct();
    }
}
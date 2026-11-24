class Product{
    String productName;
    int quantity;
    double price;
    Product(){
        productName="Unknown";
        quantity=1;
        price=100;
    }
    Product(String productName){
        this.productName=productName;
        quantity=1;
        price=100;
    }
    Product(String productName, int quantity, double price){
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    void calculateTotal(){
        System.out.println("Total Price:₹" +(quantity*price));
    }
}

public class Main10{
    public static void main(String[] args){
        Product x=new Product();
        Product y=new Product("Laptop");
        Product z=new Product("Phone", 2, 15000);
        x.calculateTotal();
        y.calculateTotal();
        z.calculateTotal();
    }
}
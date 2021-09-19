package MindTap.Unit10.tenDashSeven;

public class DeliveryPizza extends Pizza
{
   // Define DeliveryPizza class here
    private double deliveryFee;
    private String address;

    public DeliveryPizza(String description, double price, String address){
        super(description,price);
        this.address = address;
        this.deliveryFee = 5;
        if(price > 15) {
            this.deliveryFee = 3;
        }
    }

    public double getDeliveryFee(){
        return deliveryFee;
    }
    public String getAddress(){
        return address;
    }

    public void display(){
        super.display();
        System.out.println("Delivery to " + getAddress() + " which costs $" + String.format("%.2f", getDeliveryFee()) + " for a total of $" + (getPrice() + getDeliveryFee()));
    }
}

package MindTap.Unit10.tenDashSeven;

public class Pizza
{
    // Define the Pizza class here
    private String description;
    private double price;

    public Pizza(String description, double price){
        this.description = description;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void display(){
        System.out.println(description + " pizza   Price: $" + price);
    }

}


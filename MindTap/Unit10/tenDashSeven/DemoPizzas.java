package MindTap.Unit10.tenDashSeven;

public class DemoPizzas
{
   public static void main(String[] args)
   {
      // Write demo program here
      Pizza P1 = new Pizza("sausage and onion",14.99);
      P1.display();

      DeliveryPizza P2 = new DeliveryPizza("Supreme",18.99,"Pine ST");
      P2.display();
   }
}

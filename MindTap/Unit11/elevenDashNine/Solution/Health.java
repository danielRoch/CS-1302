import java.util.*;
public class Health extends Insurance 
{
    public Health()
    {
        super("Health");
        setCost();
    }
    public void setCost()
    {
        cost = 196;
    }
    public void display()
    {
        System.out.println(" " + type +
                " insurance costs $" + cost + " per month");
    }
}

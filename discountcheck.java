import java.lang.*;
import java.util.*;

public class discountcheck
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("**");
        System.out.println("NOTE- Cost of 1 unit is 100");
        System.out.println("Please enter number of units purchased :");
        int unit=s.nextInt();
        int amt=unit*100;
        int discPrice=amt/10;
        int finalPrice=amt-discPrice;
        if (amt>=1000)
        {
            System.out.println("Thank you for your purchase you got a discount of 10% ");
            System.out.println("Your final bill is :"+finalPrice);
        }
        else
        {
            System.out.println("No Discount");
        }
    }
}

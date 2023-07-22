import java.lang.*;
import java.util.*;

public class New
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a year:");
        int year=s.nextInt();
        if ((year%100)==0)
        {
            if ((year%400)==0)
            {
                System.out.println("Its a Leap year");
            }
            else
            {
                System.out.println("Its a not leap year");
            }
        }
        else if((year%4)==0)
        {
            System.out.println("Its a leap year");
        }
        else
        {
            System.out.println("Its a not leap year");
        }
    }
}

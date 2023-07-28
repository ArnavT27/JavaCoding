import java.lang.*;
import java.util.*;

public class countNoOfDigits
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        int r,count=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            count++;
        }
        System.out.println("Number of digits are :"+count);
    }
}

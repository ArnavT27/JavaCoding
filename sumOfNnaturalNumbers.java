import java.lang.*;
import java.util.*;

public class sumOfNnaturalNumbers
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        int j=0;
        for (int i=1;i<=n;i++)
        {
            j=i+j;
        }
        System.out.println("Sum of first "+n+ " natural numbers is:"+j);
    }
}

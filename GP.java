import java.lang.*;
import java.util.*;

public class GP
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first term of the AP:");
        int a=s.nextInt();
        System.out.println("Enter common ration of the AP:");
        int r=s.nextInt();
        System.out.println("Enter number of terms :");
        int n=s.nextInt();
        System.out.println("GP is:");
        for (int i=1;i<=n;i++)
        {
            System.out.print(a+",");
            a=a*r;
        }
    }
}

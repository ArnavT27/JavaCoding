import java.lang.*;
import java.util.*;

public class AP
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first term of the AP:");
        int a=s.nextInt();
        System.out.println("Enter common difference of the AP:");
        int d=s.nextInt();
        System.out.println("Enter number of terms :");
        int n=s.nextInt();
        int an=a+((n-1)*d);
        System.out.println("AP is:");
        while(a<=an)
        {
            System.out.print(a+",");
            a=a+d;
        }
    }
}

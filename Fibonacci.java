import java.lang.*;
import java.util.*;

public class Fibonacci
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter number of terms:");
        int n=s.nextInt();
        int a=0,b=1;
        System.out.println("Fibonacci series :");
        System.out.print(a+","+b+",");
        for (int i=1;i<=n-2;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+",");
        }
    }
}

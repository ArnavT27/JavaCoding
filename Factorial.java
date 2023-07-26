import java.lang.*;
import java.util.*;

public class Factorial
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        int j=1;
        for (int i=1;i<=n;i++)
        {
            j=i*j;
        }
        System.out.println(n+" factorial is:"+j);
    }
}

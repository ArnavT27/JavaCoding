import java.lang.*;
import java.util.*;

public class Pattern7
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                if ((i+j)>=n+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j=1;j<=n;j++)
            {
                if (i>j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--)
        {
            for (int j=n;j>=1;j--)
            {
                if (i>j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j=n;j>=1;j--)
            {
                if ((i+j)>n+2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

import java.lang.*;
import java.util.*;

public class Pattern1
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
                System.out.print((j+i)+" ");
            }
            System.out.println();
        }
    }
}

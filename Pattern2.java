import java.lang.*;
import java.util.*;

public class Pattern2
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        int count=1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                System.out.format(" %02d ",count);
                count++;
            }
            System.out.println();
        }
    }
}

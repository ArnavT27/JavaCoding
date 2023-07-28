import java.lang.*;
import java.util.*;

public class New
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}

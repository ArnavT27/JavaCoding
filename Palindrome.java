import java.lang.*;
import java.util.*;

public class New
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        int m=n;
        int rev=0;
        int r;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        System.out.println(rev);
        if (m==rev)
        {
            System.out.println("Number is Palindrome number");
        }
        else
        {
            System.out.println("Number is not a palindrome number");
        }
    }
}

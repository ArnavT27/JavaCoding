import java.lang.*;
import java.util.*;

public class OddEven
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter any number:");
        int n=s.nextInt();
        int x=n%2;
        if (x==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}

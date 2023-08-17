import java.lang.*;
import java.util.*;

public class Smallest
{
    static double small(double a,double b,double c)
    {
        if (a<b && a<c)
            return a;
        else if (b<c)
            return b;
        else return c;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        double a=s.nextDouble();
        System.out.println("Enter second number:");
        double b=s.nextDouble();
        System.out.println("Enter third number:");
        double c=s.nextDouble();
        System.out.println("Smallest number is :"+small(a,b,c));
    }
}

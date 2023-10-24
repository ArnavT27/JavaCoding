import java.util.*;
public class FactorialUsingRecursion
{
    public static void factorial(int fac,int n,int num)
    {
        if(n==num)
        {
            fac*=n;
            System.out.println(fac);
            return ;
        }
        fac = fac * n;
        factorial(fac,n + 1, num);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        int n=1,fac=1;
        factorial(fac,n,num);
    }
}

/*
import java.util.*;
public class gmailProj
{
    public static int factorial(int fac,int n,int num)
    {
        if(n==num)
        {
            fac*=n;
            return fac;
        }
        fac = fac * n;
        return factorial(fac,n + 1, num);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        int n=1,fac=1;
        System.out.println(factorial(fac,n,num));
    }
}

*/




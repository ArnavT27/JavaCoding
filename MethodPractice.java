import java.lang.*;
import java.util.*;

public class MethodPractice
{
    int max(int x,int A[])
    {
        for (int i=0;i<A.length;i++)
        {
            if (A[i]>x)
                x=A[i];
        }
        return x;
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt();
        int A[]=new int[size];
        System.out.println("enter numbers of array:");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        New m=new New();
        System.out.println("MAX element in array is:"+m.max(A[0],A));
    }









    /* FINDING GCD OF 2 NUMBERS
    
    int gcd(int m,int n)
    {
        while(m!=n)
        {
            if (m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 numbers to find gcd:");
        int m=s.nextInt();
        int n=s.nextInt();
        New g=new New();
        System.out.println("Greatest common divisor of "+m+" and "+n+" is: "+g.gcd(m,n));
    }

     */
    








    /* TO CHECK WHETHER A NUMBER IS PRIME OR NOT
    
    static boolean isPrime(int num)
    {
        for (int i=2;i<=(num/2);i++)
        {
            if (num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not:");
        int num=s.nextInt();
        System.out.println("Number "+num+" is a Prime   number :"+isPrime(num));

    }

     */
}

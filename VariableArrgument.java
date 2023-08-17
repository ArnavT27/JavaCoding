import java.lang.*;
import java.util.*;

public class VariableArrgument
{
    static double disc(double ...P)
    {
        double sum=0;
        double disc;
        for (int i=0;i<P.length;i++)
        {
            sum=sum+P[i];
        }
        if (sum<500)
            return sum/10;
        else if (sum>500 && sum<1000)
            return (sum*15)/100;
        else
            return sum/5;
    }

    public static void main(String args[])
    {
        System.out.println("Congratulation you have saved : "+disc(100,200,300,490));
    }



   /*
    static int sum(int ...A)
    {
        if (A.length==0) return 0;
        int sum=0;
        for (int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println(sum());
        System.out.println(sum(10,20,30));
        System.out.println(sum(28,39,10,40));
    }

    */


    /*
    static int max(int ...A)
    {
        if (A.length==0)return Integer.MIN_VALUE;
        int m=A[0];
        for (int i=0;i<A.length;i++)
        {
            if (A[i]>m)
                m=A[i];
        }
        return m;

    }
    public static void main(String args[])
    {
        System.out.println(max());
        System.out.println(max(10,50));
        System.out.println(max(30 ,67));
        System.out.println(max(19,28,34,64,100));
    }

     */




    /*
    static void show(int start, String... S) {
        for (int i = 0; i < S.length; i++) {
            System.out.println(start + ". " + S[i]);
            start++;
        }
    }

    public static void main(String args[]) {
        show(1, "Arnav", "karl", "mayank", "Eupho", "KK");
    }
    // variable argument must be the last parameter in parameter list
    */


    /*
    static void show(int ...x)
    {
        for (int a:x)
        {
            System.out.print(a+" ");
        }
    }
    public static void main(String args[])
    {
        show( new int[]{1,2,3,4,5,6});
    }

     */


}

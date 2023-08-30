import java.lang.*;
import java.util.*;

public class Class
{
    static boolean Class(int A[],int size)
    {
        int count=0;
        double k=count/2;
        for (int i=0;i<A.length;i++)
        {
            if (A[i]<0)
            {
                count++;
            }
        }
        if (count>(size/2))
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int size=s.nextInt();
        int A[]=new int[size];
        System.out.println("Enter the elements first of array");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        System.out.println(Class(A,size));
    }
}

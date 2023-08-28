import java.lang.*;
import java.util.*;

public class Minimum
{
    static void min(int A[])
    {
        int min=A[0];
        for (int i=0;i<A.length;i++)
        {
            if (A[i]<min)
                min=A[i];
        }
        System.out.println("Minimum number in array is :"+min);

    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=s.nextInt();
        int A[]=new int[size];
        System.out.println("Enter the elements of array");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        min(A);
    }
}

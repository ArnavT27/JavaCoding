import java.lang.*;
import java.util.*;

public class Duplicate
{
    static void min(int A[])
    {
        for (int i=0;i<A.length-1;i++)
        {
            for (int j=i+1;j<A.length;j++)
            {
                if (A[i]==A[j] && (i!=j))
                    System.out.println("Duplicate number is:"+A[i]);
            }
        }

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

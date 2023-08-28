import java.lang.*;
import java.util.*;

public class CommonElementInArray
{
    static void min(int A[],int B[])
    {
        for (int i=0;i<A.length;i++)
        {
            for (int j=0;j<B.length;j++)
            {
                if (A[i]==B[j])
                    System.out.println("Common element is :"+A[i]);
            }
        }

    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int size1=s.nextInt();
        System.out.println("Enter the size of the second array:");
        int size2=s.nextInt();
        int A[]=new int[size1];
        int B[]=new int[size2];
        System.out.println("Enter the elements first of array");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        System.out.println("Enter the elements of second array:");
        for (int i=0;i<A.length;i++)
        {
            B[i]=s.nextInt();
        }
        min(A,B);
    }
}

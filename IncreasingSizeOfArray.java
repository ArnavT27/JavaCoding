import java.lang.*;
import java.util.*;

public class IncreasingSizeOfArray
{
    public static void main(String args[])
    {
        int A[]={2,3,1,5,10};
        int B[]=new int[2*A.length];
        for (int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        for (int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        A=B; 
        B=null;
        System.out.println();
        System.out.println(A.length);
        System.out.println(B);



        /* REVERSE COPYING OF ARRAY
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=s.nextInt();
        int A[]=new int[size];
        int B[]=new int[size];
        System.out.println("Enter the elements of the array :");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        for (int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }
        for (int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
         */


        /* COPYING OF ARRAY
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=s.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements of array:");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        int B[]=new int[n];
        for (int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        for (int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
         */
    }
}

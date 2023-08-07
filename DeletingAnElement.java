import java.lang.*;
import java.util.*;

public class DeletingAnElement
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=s.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements of array:");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        System.out.println("Entered array is:");
        for (int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the index of the number you want to remove :");
        int index=s.nextInt();
        A[index]=0;
        for (int i=index;i<A.length-1;i++)
        {
            A[i]=A[i+1];
            A[i+1]=0;
        }
        System.out.println("New Array is:");
        for (int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}

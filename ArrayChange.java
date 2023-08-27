import java.lang.*;
import java.util.*;

public class ArrayChange
{
    static void change(int A[],int index,int number)
    {
        A[index]=number;
        for (int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=s.nextInt();
        int A[]=new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        System.out.println("Enter the index of the number you want to change :");
        int index=s.nextInt();
        if (index>(size-1))
            System.out.println("Invalid index");
        else {
            System.out.println("Enter the number which you want to put in that place:");
        }
        int number=s.nextInt();
        change(A,index,number);
    }
}

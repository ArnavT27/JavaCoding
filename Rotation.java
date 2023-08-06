import java.lang.*;
import java.util.*;

public class Rotation
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        System.out.println("Your entered array is:");
        for (int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        int temp=A[A.length-1];
        for (int i=A.length-2;i>=0;i--)
        {
            A[i+1]=A[i];
        }
        A[0]=temp;
        System.out.println();
        System.out.println("Right Reversed array is:");
        for (int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }






//        LEFT ROTATION OF ARRAY
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int n=s.nextInt();
//        int A[]=new int[n];
//        System.out.println("Enter the elements of the array:");
//        for (int i=0;i<A.length;i++)
//        {
//            A[i]=s.nextInt();
//        }
//        int temp=A[0];
//        System.out.println("Your entered array is:");
//        for (int i=0;i<A.length;i++)
//        {
//            System.out.print(A[i]+" ");
//        }
//        System.out.println();
//        for (int i=0;i<A.length-1;i++)
//        {
//            A[i]=A[i+1];
//        }
//        A[A.length-1]=temp;
//        System.out.println("Left rotated array is:");
//        for (int i=0;i<A.length;i++)
//        {
//            System.out.print(A[i]+" ");
//        }
    }
}

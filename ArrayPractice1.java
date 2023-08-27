import java.lang.*;
import java.util.*;

public class New
{
    static void max(int A[])
    {
        int max1,max2;
        max1=max2=A[0];
        for (int i=0;i<A.length;i++)
        {
            if (A[i]>max1)
            {
                max2 = max1;
                max1 = A[i];
            }
            else if (A[i]>max2)
                max2=A[i];
        }
        System.out.println("Second largest number is:"+max2);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=s.nextInt();
        int A[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        max(A);
    }
}




//        FINDING MAXIMUM ELEMENT


//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int n=s.nextInt();
//        int A[]=new int[n];
//        System.out.println("Enter elements of the array");
//        for (int i=0;i<A.length;i++)
//        {
//            A[i]=s.nextInt();
//        }
//        int max=A[0];
//        for (int i=0;i<A.length;i++)
//        {
//            if (A[i]>max)
//            {
//                max=A[i];
//            }
//        }
//        System.out.println("Greatest number is :"+max);





//        SEARCHING AN ELEMENT PROGRAM

//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Size of the array:");
//        int n=s.nextInt();
//        int A[]=new int[n];
//        System.out.println("Enter elements of the array");
//        for (int i=0;i<A.length;i++)
//        {
//            A[i]=s.nextInt();
//        }
//        System.out.println("Enter the number you want to find :");
//        int key=s.nextInt();
//        for (int i=0;i<A.length;i++)
//        {
//            if (key==A[i])
//            {
//                System.out.println("NUMBER FOUND");
//                System.out.println("Your entered number index is:"+i);
//                System.exit(0);
//            }
//        }
//        System.out.println("NUMBER NOT FOUND");
//








//      SUM OF ARRAY PROGRAM

//        Scanner s=new Scanner(System.in);
//        System.out.println("Please enter the size of array:");
//        int n=s.nextInt();
//        int sum=0;
//        int A[]=new int[n];
//        System.out.println("Enter the elements of the array:");
//        for (int i=0;i<n;i++)
//        {
//            A[i]=s.nextInt();
//            sum=sum+A[i];
//        }
//        System.out.println("Sum of elements of the array is:"+sum);
    }
}

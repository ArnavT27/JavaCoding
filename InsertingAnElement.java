import java.lang.*;
import java.util.*;

public class InsertingAnElement
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int A[]=new int[10];
        A[0]=1;
        A[1]=3;
        A[2]=10;
        A[3]=14;
        A[4]=20;
        A[5]=9;
        System.out.println("Enter the number you want to include in array:");
        int n=s.nextInt();
        System.out.println("Enter index at which you want to add a number:");
        int index=s.nextInt();
        for (int i=A.length-1;i>=index;i--)
        {
            A[i]=A[i-1];
        }
        A[index]=n;
        System.out.println("New Array is:");
        for (int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("Do you want to add more elements :");
        String ans=s.nextLine();
        ans=s.nextLine();
        if (ans.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter the number you want to include in array:");
            n=s.nextInt();
            System.out.println("Enter index at which you want to add a number:");
            index=s.nextInt();
            for (int i=A.length-1;i>=index;i--)
            {
                A[i]=A[i-1];
            }
            A[index]=n;
            System.out.println("New Array is:");
            for (int i=0;i<A.length;i++)
            {
                System.out.print(A[i]+" ");
            }

        }
        else
            System.out.println("OK Thank you");

    }
}

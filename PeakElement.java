import java.lang.*;
import java.util.*;

public class PeakElement
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=s.nextInt();
        int A[]=new int[size];
        System.out.println("Enter numbers of array:");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        for (int i=1;i<A.length-1;i++)
        {
            if (A[i]>=A[i+1] && A[i]>=A[i-1])
            {
                System.out.print(A[i]+" ");
                System.out.println();
                System.out.println(i);
            }
            else
                System.out.println("There is no number which is not smaller than its neighbours");
        }
    }
}

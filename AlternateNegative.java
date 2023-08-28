import java.lang.*;
import java.util.*;

public class AlternateNegative
{
    static boolean Class(int A[])
    {
        for (int i=1;i<A.length;i++)
        {
            if ((A[i-1]*A[i])>=0) {
                return false;
            }
            else if (A[0]==0)
            {return false;}
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int size1=s.nextInt();

        int A[]=new int[size1];
        System.out.println("Enter the elements first of array");
        for (int i=0;i<A.length;i++)
        {
            A[i]=s.nextInt();
        }
        System.out.println(Class(A));
    }
}

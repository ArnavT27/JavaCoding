import java.lang.*;
import java.util.*;

public class Array
{
    public static void main(String args[])
    {
        int A[]=new int[5];
        int B[]={1,2,3,4,5,3};
        A[1]=10;
        for (int i=0;i<B.length;i++)
        {
            System.out.print(B[i]++ +" ");
        }
        System.out.println();
        for (int x:B)
        {
            System.out.print(x+" ");
        }
    }
}

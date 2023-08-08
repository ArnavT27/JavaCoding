import java.lang.*;
import java.util.*;

public class 2DArray
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int row=s.nextInt();
        System.out.println("Enter number of columns:");
        int col=s.nextInt();
        int A[][]=new int[row][col];
        System.out.println("Enter the elements:");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                A[i][j]=s.nextInt();
            }
        }
        System.out.println("Your entered 2D array:");
        for (int i=0;i<A.length;i++)
        {
            for (int j=0;j<A[0].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}

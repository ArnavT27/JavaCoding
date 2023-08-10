import java.lang.*;
import java.util.*;

public class MatrixMultiplication
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("**");
        System.out.println("Enter number of rows in first matrix:");
        int row1=s.nextInt();
        System.out.println("Enter number of columns in first matrix:");
        int col1=s.nextInt();
        System.out.println("Enter number of columns in second matrix:");
        int col2=s.nextInt();
        int A[][]=new int[row1][col1];
        int B[][]=new int[col1][col2];
        int C[][]=new int [row1][col2];
        System.out.println("Enter elements of first matrix");
        for (int i=0;i<row1;i++)
        {
            for (int j=0;j<col1;j++)
            {
                A[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix");
        for (int i=0;i<col1;i++)
        {
            for (int j=0;j<col2;j++)
            {
                B[i][j]=s.nextInt();
            }
        }
        for (int i=0;i<row1;i++)
        {
            for (int j=0;j<col2;j++)
            {
                C[i][j]=0;
                for (int k=0;k<col2;k++)
                {
                    C[i][j]=C[i][j]+(A[i][k]*B[k][j]);
                }
            }
        }
        for (int x[]:C)
        {
            for (int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        /*
        Sorting OF arrays
        String arr[]={"Java","java","arnav","python"};
        java.util.Arrays.sort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        } */
    }
}

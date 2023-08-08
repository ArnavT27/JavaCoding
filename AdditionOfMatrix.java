import java.lang.*;
import java.util.*;

public class AdditionOfMatrix
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row=s.nextInt();
        System.out.println("Enter number of columns:");
        int col=s.nextInt();
        int A[][]=new int[row][col];
        int B[][]=new int [row][col];
        System.out.println("Enter numbers of first matrix:");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                A[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter numbers of second matrix:");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                B[i][j]=s.nextInt();
            }
        }
        int C[][]=new int[row][col];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("Addition of two entered matrix is:");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}

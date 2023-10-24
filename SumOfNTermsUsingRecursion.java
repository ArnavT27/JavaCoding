import java.util.*;
public class SumOfNTermsUsingRecursion
{
    public static int printNum(int sum,int n,int num)
    {
        if(n==num)
        {
            sum+=n;
            return sum;
        }
        sum = sum + n;
        return printNum(sum,n + 1, num);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        int n=1,sum=0;
        System.out.println("Sum of first "+num+" terms is: "+printNum(sum,n,num));
    }
}

/*  CODE 2
import java.util.*;
public class SumOfNTermsUsingRecursion
{
    public static void printNum(int sum,int n,int num)
    {
        if(n==num)
        {
            sum+=n;
            System.out.println(sum);
            return ;
        }
        sum = sum + n;
        printNum(sum,n + 1, num);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        int n=1,sum=0;
        printNum(sum,n,num);
    }
}
*/



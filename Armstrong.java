import java.util.*;
public class Armstrong {
    public static boolean armstrong(int num)
    {
        int temp=num;
        int r,count=0;
        while(num>0)
        {
            r=num%10;
            num/=10;
            count++;
        }
        num=temp;
        int rem,sum=0;
        while(temp>0)
        {
            rem=temp%10;
            sum+=Math.pow(rem,count);
            temp/=10;
        }
        if(sum==num) {
            return true;
        }
        return false;

    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        System.out.println("Is "+num+" an armstrong number : "+armstrong(num));
    }
}

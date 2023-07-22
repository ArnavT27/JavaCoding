import java.lang.*;
import java.util.*;

public class Grade
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter marks of subject 1st out of 100:");
        int m1=s.nextInt();
        System.out.println("Please enter marks of subject 2nd out of 100:");
        int m2=s.nextInt();
        System.out.println("Please enter marks of subject 3rd out of 100:");
        int m3=s.nextInt();
        float avg=(m1+m2+m3)/3f;
        System.out.println("Average of your marks is:"+avg);
        if (avg>=80)
        {
            System.out.println("Your grades are A");
        }
        else if (avg>=70 && avg<80)
        {
            System.out.println("Your grades are B");
        }
        else if (avg>=60 && avg<70)
        {
            System.out.println("Your grades are C");
        }
        else if (avg>=50 && avg<60)
        {
            System.out.println("Your grades are D");
        }
        else if (avg>=40 && avg<50)
        {
            System.out.println("Your grades are E");
        }
        else
        {
            System.out.println("Your grades are F");
        }
    }
}

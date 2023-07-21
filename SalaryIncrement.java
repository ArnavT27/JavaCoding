import java.lang.*;
import java.util.*;

public class SalaryIncrement
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("**");
        System.out.println("Please enter your age of service for this company in years:");
        int serviceAge=s.nextInt();
        System.out.println("Please enter you current salary:");
        int salary=s.nextInt();
        int bonus=(salary*5)/100;
        int netSalary=salary+bonus;
        if (serviceAge>=5)
        {
            System.out.println("Congratulation you are eligible for the 5% increment in salary");
            System.out.println("Your net salary is:"+netSalary);
        }
        else
        {
            System.out.println("No increment we hope you get a bonus soon");
        }
    }
}

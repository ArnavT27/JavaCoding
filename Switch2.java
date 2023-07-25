import java.lang.*;
import java.util.*;

public class New
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int no1=s.nextInt();
        int no2=s.nextInt();
        System.out.println("Menu");
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV");
        System.out.println("Please enter option in words:");
        s.nextLine();
        String option=s.nextLine();
        /** whenever we are taking any integer before string then we have to write nextLine() two times */
        option=option.toUpperCase();
        switch (option)
        {
            case "ADD":
                System.out.println("Addition is "+(no1+no2));
                break;
            case "SUB":
                System.out.println("Subtraction is "+(no1-no2));
                break;
            case "MUL":
                System.out.println("Multiplication is "+(no1*no2));
                break;
            case "DIV":
                System.out.println("Division is "+(no1/no2));
                break;
            default:
                System.out.println("Invalid command");
                break;
        }

    }
}

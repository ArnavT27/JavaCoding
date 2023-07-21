import java.lang.*;
import java.util.*;

public class GradingSystem {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter obtained percentage :");
        int x = s.nextInt();
        if (x >= 95)
        {
            System.out.println("A+");
        }
        else if (x >= 90 && x < 95)
        {
            System.out.println("Your Grades are A");
        }
        else if (x >= 85 && x < 90)
        {
            System.out.println("Your Grades are B+");
        }
        else if (x >= 80 && x < 85)
        {
            System.out.println("Your Grades are B");
        }
        else if (x >= 75 && x < 80)
        {
            System.out.println("Your Grades are C+");
        }
        else if (x >= 70 && x < 75)
        {
            System.out.println("Your Grades are C");
        }
        else if (x >= 65 && x < 70)
        {
            System.out.println("Your Grades are D+");
        }
        else if (x >= 60 && x < 65)
        {
            System.out.println("Your Grades are D");
        }
        else if (x >= 55 && x < 60)
        {
            System.out.println("Your Grades are E+");
        }
        else if (x >= 50 && x < 55)
        {
            System.out.println("Your Grades are E");
        }
        else
        {
            System.out.println("Your Grades are F");
        }
    }
}

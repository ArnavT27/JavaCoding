import java.lang.*;
import java.util.*;

public class IfElsePractice
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age=s.nextInt();
        System.out.println("Please enter you marital status (Y or N):");
        char mS=s.next().charAt(0);
        System.out.println("Please enter your sex(M or F):");
        char S=s.next().charAt(0);
        if (S=='F' || S=='f')
        {
            System.out.println("Place of service is Urban area only");
        }
        else if (age>=20 && age<40)
        {
            System.out.println("Place of work is anywhere");
        }
        else if (age>=40 && age<=60)
        {
            System.out.println("Place of work is Urban area only");
        }
        else
        {
            System.out.println("ERROR");
        }

    }
}

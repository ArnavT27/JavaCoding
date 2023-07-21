import java.lang.*;
import java.util.*;

public class New
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter first side of the quadrilateral:");
        int s1=s.nextInt();
        System.out.println("Please enter second side of the quadrilateral:");
        int s2=s.nextInt();
        System.out.println("Please enter third side of the quadrilateral:");
        int s3=s.nextInt();
        System.out.println("Please enter fourth side of the quadrilateral:");
        int s4=s.nextInt();
        if (s1==s2 && s2==s3 && s3==s4 && s4==s1)
        {
            System.out.println("It is a square");
        }
        else if (s1==s3 && s2==s4)
        {
            System.out.println("It is a Rectangle");
        }
        else
        {
            System.out.println("Its a different quadrilateral");
        }
    }
}

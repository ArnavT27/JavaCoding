import java.lang.*;
import java.util.*;

public class New
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("**");
        System.out.println("Please enter the number of classes held :");
        int classHeld=s.nextInt();
        System.out.println("Please enter the number of classes attended by you:");
        int classAttended=s.nextInt();
        int attendence= (classAttended*100)/classHeld;
        if (attendence>=75)
        {
            System.out.println("You can give the exam");
        }
        else
        {
            System.out.println("I am sorry you are not eligible for giving the exam as your attendence is less than 75%");
        }
    }
}

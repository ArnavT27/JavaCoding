import java.lang.*;
import java.util.*;

public class New
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a character:");
        char c=s.next().charAt(0);
        int ascii1=(int) c;
        if (ascii1>=65 && ascii1<=90)
        {
            System.out.println("Character is in uppercase");
        }
        else if (ascii1>=97 && ascii1<=122)
        {
            System.out.println("Character is in lowercase");
        }
        else
        {
            System.out.println("Invalid");
        }

    }
}

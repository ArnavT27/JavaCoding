import java.lang.*;
import java.util.*;

public class New
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter url of the website:");
        String url=s.nextLine();
        int x=url.lastIndexOf(".");
        String str=url.substring(x+1,url.length());
        switch (str)
        {
            case "com":
                System.out.println("Commercial");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "net":
                System.out.println("Network");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case "biz":
                System.out.println("business");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}

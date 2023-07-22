import java.lang.*;
import java.util.*;

public class website
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("**");
        System.out.println("NOTE- please do not enter region name at the end of the url");
        System.out.println("Please enter the url of a website:");
        String url=s.nextLine();
        int x=url.lastIndexOf(".");
        int y=url.length();
        String str=url.substring(x+1,y);

        String str2=url.substring(0,url.indexOf(":"));

        if (str.equals("com"))
        {
            System.out.println("Its a commercial website");
        }
        else if (str.equals("gov"))
        {
            System.out.println("Its a government based website");
        }
        else if (str.equals("org"))
        {
            System.out.println("Its a organisation based website");
        }
        else if (str.equals("net"))
        {
            System.out.println("Its a network based website");
        }
        else if (str.equals("biz"))
        {
            System.out.println("Its a business based website");
        }
        else
        {
            System.out.println("Cannot Identify the website ");
        }

        if (str2.equalsIgnoreCase("https"))
        {
            System.out.println("Its a secured hypertext transfer protocol");
        }
        else if (str2.equalsIgnoreCase("http"))
        {
            System.out.println("Its a hypertext transfer protocol");
        }
        else if (str2.equalsIgnoreCase("ftp"))
        {
            System.out.println("Its a file transfer protocol");
        }
        else
        {

        }
    }
}

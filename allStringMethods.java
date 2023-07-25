import java.lang.*;
import java.util.*;

public class allStringMethods
{
    public static void main(String args[])
    {
        String str="  www.EXCEPTION.com   ";
        String strA="Arnav";
        String strB="ARNAV";
        String strC=new String("Arnav");
        String strD="the great";

        int l=str.length();
        System.out.println("Length of the string is :"+l);

        String str1=str.toUpperCase();
        System.out.println("Upper case:"+str1);

        String str2=str.toLowerCase();
        System.out.println("Lower case:"+str2);

        String str3=str.trim();
        System.out.println("Trimming:"+str3);

        String str4=str.substring(5);
        System.out.println(str4);

        String str6=str.substring(5,9);
        System.out.println(str6);

        boolean str5=str.startsWith("www");
        System.out.println(str5);

        boolean str7=str.endsWith("com");
        System.out.println(str7);

        char str8=str.charAt(5);
        System.out.println("Character at 5th index of str object is:"+str8);

        int str9=str.indexOf("E",8);
        System.out.println(str9);

        int str10=str.lastIndexOf("E");
        System.out.println(str10);

        boolean str11=strA.equals(strC);
        System.out.println(str11);

        boolean str12=strA.equalsIgnoreCase(strB);
        System.out.println(str12);

        int str13=strA.compareTo(strB);
        System.out.println(str13);
        /** output gives the difference between ASCII codes of first letter of both the word*/

        System.out.println(strA==strC);
        System.out.println(strA.equals(strC));
        System.out.println("**");
        System.out.println(strD.contains("great"));
        System.out.println("**");
        System.out.println(strD.concat(strA));
        System.out.println(strD+strA );
        System.out.println(String.valueOf(65));
    }
}

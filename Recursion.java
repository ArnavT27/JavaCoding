import java.lang.*;
import java.util.*;

public class Recursion
{
    static void fun(int n)
    {
        if (n>0)
        {
            fun(n - 1);
            System.out.print(n+" ");
        }
    }
    public static void main(String args[])
    {
        fun(3);
    }
    /*
    static void fun(int n)
    {
        if (n>0)
        {
            System.out.print(n+" ");
            fun(n - 1);
        }
    }
    public static void main(String args[])
    {
        fun(3);
    }

     */
}

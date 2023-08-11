import java.lang.*;
import java.util.*;

public class MethodCalling
{
     int max (int x,int y)
    {
        if (x>y)
            return x;
        else
            return y;
    }
    public static void main(String args[])
    {
        New n=new New();
        int a=10,b=15;
        System.out.println(n.max(a,b));
    }
}

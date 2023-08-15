import java.lang.*;
import java.util.*;

public class New
{
    static int area(int length,int breadth)
    {
        int a=length*breadth;
        return a;
    }
    static double area(int radius)
    {
        double a=Math.PI*radius*radius;
        return a;
    }
    static double area(int a,int b,int h)
    {
        double ar=((a+b)*h)/2;
        return ar;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle:");
        int length=s.nextInt();
        int breadth=s.nextInt();
        System.out.println("Area of rectangle is:"+area(length,breadth));
        System.out.println();
        System.out.println("Enter radius of circle:");
        int radius=s.nextInt();
        System.out.println("Area of circle:"+area(radius));
        System.out.println();
        System.out.println("Enter sides of trapezium:");
        int side1=s.nextInt();
        int side2=s.nextInt();
        System.out.println("Enter height of trapezium:");
        int height=s.nextInt();
        System.out.println(area(side1,side2,height));
    }

}

import org.w3c.dom.css.Rect;

import java.lang.*;
import java.util.*;

class Cylinder
{
    private int radius;
    private int height;
    public void setRadius(int r)
    {
        if(r>0)
            radius=r;
        else
            radius=0;
    }
    public void setHeight(int h)
    {
        if (h>0)
            height=h;
        else
            height=0;
    }
    public void setDimension(int r,int h)
    {
        if(h>0)
            height=h;
        else
            height=0;
        if (r>0)
            radius=r;
        else
            radius=0;
    }
    public int getRadius()
    {
        return radius;
    }
    public int getHeight()
    {
        return height;
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
    public Cylinder()
    {
        radius=1;
        height=1;
    }
    public Cylinder(int r)
    {
        radius=r;
        height=1;
    }
    public Cylinder(int r,int h)
    {
        height=h;
        radius=r;
    }
}

public class Constructor
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int r=s.nextInt();
        System.out.println("Enter the height:");
        int h=s.nextInt();
        //Cylinder c=new Cylinder();
        //Cylinder c=new Cylinder(r);
        Cylinder c=new Cylinder(r,h);
        System.out.println(c.volume());
    }
}









/*
class Rectangle
{
    private int length;
    private int breadth;

    // Default Constructor
    public Rectangle ()
    {
        length=1;
        breadth=1;
    }

    //Constructor having two parameters
    public Rectangle(int l,int b)
    {
        length =l;
        breadth=b;
    }

    // Constructor having only one parameter
    public Rectangle(int s)
    {
        length=breadth=s;
    }
    public int area()
    {
        return length*breadth;
    }
}


public class Constructor
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length:");
        int l=s.nextInt();
        System.out.println("enter breadth:");
        int b=s.nextInt();
        // Rectangle r=new Rectangle(l);
        Rectangle r=new Rectangle(l,b);
        //Rectangle r=new Rectangle();
        System.out.println("Area is :"+r.area());

    }
}

 */

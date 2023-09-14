import java.lang.*;
import java.util.*;

class Cylinder
{
    private int radius;
    private int height;

    public void setRadius(int r)
    {
        if (r>0)
            radius=r;
        else
            radius=0;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setHeight(int h)
    {
        if (h>0)
            height=h;
        else
            height=0;
    }
    public int getHeight()
    {
        return height;
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
    public double lateralSurface()
    {
        return 2*Math.PI*radius*height;
    }
}


public class StringMethod
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius of the cylinder :");
        int r=s.nextInt();
        System.out.println("enter the height of the cylinder:");
        int h=s.nextInt();
        Cylinder c=new Cylinder();
        c.setRadius(r);
        c.setHeight(h);
        System.out.println("Lateral surface area is:"+c.lateralSurface());
        System.out.println("Volume is:"+c.volume());
        System.out.println("Radius is:"+c.getRadius());
        System.out.println("Height is:"+c.getHeight());
    }
}









/*

class Rectangle
{
    private int length;
    private int breadth;
    public int getLength()
    {
        return length;
    }
    public void setLength(int l)
    {
        if (l>0)
            length=l;
        else
            length=0;
    }
    public int getBreadth()
    {
        return breadth;

    }
    public void setBreadth(int b)
    {
        if (b>0)
            breadth=b;
        else
            breadth=0;
    }
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
}

public class StringMethod
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length:");
        int l=s.nextInt();
        System.out.println("Enter breadth:");
        int b=s.nextInt();
        Rectangle r=new Rectangle();
        r.setBreadth(b);
        r.setLength(l);
        System.out.println("Area is :"+r.area());
        System.out.println("Perimeter is:"+r.perimeter());
        System.out.println("Breadth is:"+r.getBreadth());
        System.out.println("Length is:"+r.getLength());
    }

}

 */

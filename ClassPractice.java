import java.lang.*;
import java.util.*;
class Student
{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int grade;
    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char grade()
    {
        if(grade>=60)
            return 'A';
        else
            return 'B';
    }
    public String toString()
    {
        return "\n"+"Roll no:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }
}
public class ClassPractice
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter you name:");
        String name=s.next();
        System.out.println("Enter your course name:");
        String course=s.next();
        System.out.println("Enter your roll number:");
        int roll=s.nextInt();
        System.out.println("Enter the marks of three subject:");
        int m1=s.nextInt();
        int m2=s.nextInt();
        int m3=s.nextInt();
        System.out.println("Enter your grades out of 100 :");
        int grade=s.nextInt();
        Student st=new Student();
        st.roll=roll;
        st.name=name;
        st.course=course;
        st.m1=m1;
        st.m2=m2;
        st.m3=m3;
        st.grade=grade;
        System.out.println("Details:\n"+st);
        // If we want to print object itself then object should have toString method implemented
        System.out.println("Total of marks in three subject:"+st.total());
        System.out.println("Grade is:"+st.grade());
        System.out.println("Average of marks:"+st.average());
    }
}






/*
class Cylinder
{
    public double height;
    public double radius;
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea()
    {
        return ((2*Math.PI*radius*height)+(2*lidArea()));
    }
    public double volume()
    {
        return  lidArea()*height;
    }
}
public class ClassPractice
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of cylinder:");
        int r=s.nextInt();
        System.out.println("Enter the height of cylinder:");
        int h=s.nextInt();
        Cylinder c=new Cylinder();
        c.height=h;
        c.radius=r;
        System.out.println("Area of top surface is:"+c.lidArea());
        System.out.println("Total surface area is:"+c.totalSurfaceArea());
        System.out.println("volume is:"+c.volume());
    }
}

 */





/*

class Rectangle
{
    public double length;
    public double breadth;
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        return length==breadth;
    }
}
public class ClassPractice
{
    public static void  main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of circle:");
        double l=s.nextInt();
        System.out.println("Enter the breadth of the circle:");
        double b=s.nextInt();
        Rectangle r=new Rectangle();
        r.breadth=b;
        r.length=l;
        System.out.println("Area is: "+r.area());
        System.out.println("Perimeter is: "+r.perimeter());
        System.out.println("Is it is a square: "+r.isSquare());
    }
}

 */







/*
class Circle
{
    public double area(int radius)
    {
        return Math.PI*radius*radius;
    }
    public double perimeter(int radius)
    {
        return 2*Math.PI*radius;
    }
    public double circumference(int radius)
    {
        return perimeter(radius);
    }
}
public class ClassPractice
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        int radius=s.nextInt();
        Circle c=new Circle();
        System.out.println("Perimeter is: "+c.circumference(radius));
        System.out.println("Circumference  is: "+c.perimeter(radius));
        System.out.println("Area is: "+c.area(radius));
    }
}

 */

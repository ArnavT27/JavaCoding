import java.lang.*;
import java.util.*;

public class addingAnElementInArray
{
    static int[] increase(int arr[],int index,int element,int size,int arr1[])
    {
        if(index>size)
        {
            System.out.println("Error");
            return arr;
        }
        for(int i=0;i<=size-1;i++)
        {
            arr1[i]=arr[i];
        }
        for(int i=size;i>=index+1;i--)
        {
            arr1[i]=arr[i-1];
        }
        arr1[index]=element;

        return arr1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        int arr1[]=new int[size+1];
        System.out.println("Enter the index at which you want to enter the element:");
        int index=s.nextInt();
        System.out.println("Enter the element :");
        int element=s.nextInt();
        increase(arr,index,element,size,arr1);
        for(int i=0;i<=size;i++)
        {
            System.out.print(arr1[i]+",");
        }
    }
}

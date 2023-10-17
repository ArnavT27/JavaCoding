import java.lang.*;
import java.util.*;

public class SortingUsingSelectionSort.java
{
    static void sorted(int arr[])
    {
        // time complexity = O(n^2)
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                  // ascending order sorting using selection sort
                  // for descending order sorting just change if condition to (arr[smallest]<arr[j])
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        sorted(arr);
    }
}

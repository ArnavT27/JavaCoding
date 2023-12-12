import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        int temp=0,i=0,j=size-1;
        while(i<j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k=0;k<size;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}

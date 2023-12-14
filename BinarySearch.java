import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the key:");
        int key=s.nextInt();
        int beg=0;
        int end=size-1,mid=(beg+end)/2;
        while(beg<=end)
        {
            if(arr[mid]==key)
            {
                System.out.println("Key found at "+mid);
                break;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else {
                beg=mid+1;
            }
            mid=(beg+end)/2;
        }
        if(beg>end)
        {
            System.out.println("Key not found");
        }
    }
}

import java.lang.*;
import java.util.*;

public class Arraylist
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> al1=new ArrayList<>(10);
        ArrayList<Integer> al2=new ArrayList<>(List.of(1,2,2,5,3,9,0));
        al1.add(0);// to add element in array list
        al1.add(0,3);// to add element at particular index
        al1.add(6);
        al1.add(1);
        //al1.addAll(al2);   //to add any collection
        System.out.println("Element at index 1 is:"+al1.get(1));// to find element at particular index
        /*al1.addAll(1,al2);   to add any collection at particular index */
        System.out.println(al1);


        System.out.println();
        //al1.clear();  //to clear collection
        System.out.println("Is collection al1 empty:"+al1.isEmpty()); // to check empty or not
        //al1.removeAll(al2);   //to remove elements of al1 that are present in al2
        //System.out.println(al1);


        System.out.println();
        //al1.remove(0); // to remove element at particular index
        //al1.remove(Integer.valueOf(6)); // to remove element e and we don't know the index
        System.out.println(al1.remove(Integer.valueOf(16))); // it will return boolean type and then remove value
        System.out.println(al1);
        System.out.println("Size of al1 is:"+al1.size());
        System.out.println(al1.contains(10)); // to check whether collection contain a particular element or not


        System.out.println();
        Collections.sort(al1); // to sort in ascending order
        System.out.println("Sorted collection is:"+al1);
        Collections.sort(al1,Collections.reverseOrder()); // to sort in descending order
        System.out.println("Sorted in descending order"+al1);



        System.out.println();
        // How to copy elements of list in array
        int arr[]=new int[al1.size()];
        for(int i=0;i<al1.size();i++)
        {
            arr[i]=al1.get(i);
        }
        System.out.println("**");
        Arrays.sort(arr); //to sort the array
        System.out.println("Elements of array is:");
        for(int i=0;i<al1.size();i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();



        // if don't specify type of arraylist then we can store any type of data in it
        System.out.println();
        ArrayList l=new ArrayList();
        l.add('a');
        l.add(1.2f);
        l.add("Arnav");
        l.add('a');
        System.out.println(l);
        System.out.println(l.lastIndexOf('a')); // to find the index from the end of collection
        //Collections.reverse(l); // to reverse the collection
        //System.out.println(l);
        // sorting among different data types will give compiler error

        //How to directly take input into arraylist
        /*
        System.out.println("Enter the number of elements you want to input:");
        int size=s.nextInt();
        ArrayList<Integer> al3=new ArrayList<>(size);
        for (int i=0;i<size;i++)
        {
            al3.set(i,s.nextInt());
        }
        System.out.println("Elements of arraylist is:");
        for(int i=0;i<al3.size();i++)
        {
            System.out.println(al3.get(i)+" ");
        }

         */




        // wrapper classes
        System.out.println();
        Integer in= Integer.valueOf(4);
        System.out.println(in);
        Float fl=Float.valueOf(4.5f);
        System.out.println(fl);
    }
}

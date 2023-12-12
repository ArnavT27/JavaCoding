import java.util.*;
public class ReversingAnArrayList {
    static void reverseList(ArrayList<Integer> list)
    {
        int temp,i=0,j=list.size()-1;
        while(i<j)
        {
            temp=list.get(i);
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(9);
        l.add(0);
        System.out.println("Initial Arraylist is: "+l);
        reverseList(l);
        System.out.println(l);
    }
}

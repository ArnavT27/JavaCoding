import java.util.*;
public class 2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> num=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        al.add(8);
        al.add(5);
        al.add(2);
        al.add(3);
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(10);
        al1.add(12);
        al1.add(11);
        al1.add(15);
        num.add(al);
        num.add(al1);
        num.get(1);
        num.get(0).get(1);
        System.out.println(num.get(0).remove(Integer.valueOf(8)));
        System.out.println(num);
    }
}

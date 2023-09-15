import java.lang.*;
import java.util.*;
class Customer
{
    private String customerID;
    private String name;
    private String address;
    private String phNo;
    public String getCustomerID() {return customerID;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhNo(){return phNo;}
    public void setAddress(String ad){address=ad;}
    public void setPhNo(String pno){phNo=pno;}
    public Customer(String cID,String n,String ad,String pno)
    {
        customerID=cID;
        name=n;
        address=ad;
        phNo=pno;
    }
}
public class Constructor2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name:");
        String n=s.next();
        System.out.println("Enter your customer ID:");
        String cID=s.next();
        System.out.println("Enter your phone no:");
        String pno=s.next();
        System.out.println("Enter your address:");
        String ad=s.next();
        Customer c=new Customer(cID,n,ad,pno);
        System.out.println();
        System.out.println("Address:"+c.getAddress());
        System.out.println("Name:"+c.getName());
        System.out.println("Phone number:"+c.getPhNo());
        System.out.println("customer id: "+c.getCustomerID());
    }
}




/*


class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public String getItemNo()
    {
        return itemNo;
    }
    public String getName()
    {
        return name;
    }
    public void setPrice(double p)
    {
        price=p;
    }
    public double getPrice() {return price;}
    public short getQty(){return qty;}
    public Product(String iN,String n,double pr,short qt)
    {
        itemNo=iN;
        name=n;
        qty=qt;
        price=pr;
    }

}

public class Constructor2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name:");
        String n=s.next();
        System.out.println("Enter item no:");
        String iN=s.next();
        System.out.println("Enter price:");
        double pr=s.nextDouble();
        System.out.println("Enter Quantity:");
        short qt=s.nextShort();
        Product p=new Product(iN,n,pr,qt);
        System.out.println(p.getItemNo());

    }
}

 */

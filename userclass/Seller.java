package userclass;

public class Seller extends user{
    
    
    private int seller_id;
    private String name,email,address;
    private long mobile_no;
    
 
    public Seller()
    {
        this.seller_id=0;
        this.name="default user";
        this.email="default email";
        this.mobile_no=100000;
        this.address="default address";
    }

    public Seller(int seller_id,String name,String email,long mobile_no,String address){

        this.seller_id=seller_id;
        this.name=name;
        this.email=email;
        this.mobile_no=mobile_no;
        this.address=address;
    }

    public void setseller_id(int seller_id)
    {
        this.seller_id=seller_id;
    }

    public int getsellerid()
    {
        return this.seller_id;
    }
    public void setname(String name)
    {
        this.name=name;
    }

    public String getname()
    {
        return this.name;
    }

    public void setemail(String email)
    {
        this.email=email;
    }

    public String getemail()
    {
        return this.email;
    }

    public void setmobile_no(long mobile_no)
    {
        this.mobile_no=mobile_no;
    }

    public long getmobile_no()
    {
        return this.mobile_no;
    }

    public void setaddress(String address)
    {
        this.address=address;
    }

    public String getaddress()
    {
        return this.address;
    }
    public String toString()
    {
        System.out.println("seller details are: ");
        return +seller_id+" " +name+ " " +email+ " " +mobile_no+ " "+address;
    }
}

package userclass;

public class Buyer extends user{
    
    private int buyer_id;
    private String name,email;
    private long mobile_no;
 
    public Buyer()
    {
        this.buyer_id=0;
        this.name="default user";
        this.email="default email";
        this.mobile_no=100000;
    }

    public Buyer(int buyer_id,String name,String email,long mobile_no){

        this.buyer_id=buyer_id;
        this.name=name;
        this.email=email;
        this.mobile_no=mobile_no;
    }

    public void setid(int buyer_id)
    {
        this.buyer_id=buyer_id;
    }

    public int getid()
    {
        return this.buyer_id;
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

    public String toString()
    {
       System.out.println("Buyer details are: ");
        return +buyer_id+" " +name+ " " +email+ " " +mobile_no;
    }
}

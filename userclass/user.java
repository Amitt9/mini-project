package userclass;

public class user{

    private int id;
    private String name,email;
    private long mobile_no;
 
    public user()
    {
        this.id=0;
        this.name="default user";
        this.email="default email";
        this.mobile_no=100000;
    }

    public user(int id,String name,String email,long mobile_no){

        this.id=id;
        this.name=name;
        this.email=email;
        this.mobile_no=mobile_no;
    }

    public void setid(int id)
    {
        this.id=id;
    }

    public int getid()
    {
        return this.id;
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
        return +id+" " +name+ " " +email+ " " +mobile_no;
    }
}
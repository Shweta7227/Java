

public class Name {
     public static void main(String[] args)
    {
        B obj=new B();
//        obj.name("Shweta");
        obj.name("Shweta", "Sindhu");
        obj.name("Shweta","Singh","Sindhu");
    }
}
class B
{
    String fname, mname,lname;
    public void name(String fname){
        this.fname=fname;
        System.out.print(this.fname+" ");
    }
    public void name(String fname,String mname){
        this.mname=mname;
        this.name(fname);
        System.out.print(this.mname+" ");
    }
    public void name(String fname,String mname,String lname)
    {
        this.lname=lname;
        this.name(fname, mname);
        System.out.print(this.lname+" \n");
        
    }
//    System.out.println();
}



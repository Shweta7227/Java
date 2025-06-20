
public class Get_set {
     public static void main(String [] args)
    {
        C1 c=new C1();
        c.Change(10);
        System.out.println("value of a is:"+c.Show());
    }
}
class C1{
    private int a;
//    public static void Change(int a)
//    {
//        this.a=a;
//    }
    public void Change(int a)//setter
    {
        this.a=a;
    }
    public int Show()//getter
    {
        return a;
    }
}

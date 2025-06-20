// package OOPS;

public class Diff_static {
     public static void main(String [] args)
    {
        Pen p=new Pen();
        Rub r=new Rub();
        Rub.r1();
    }
}
class Pen{
    static int a=10;
    int b=20;
    public static void p1(){
        System.out.println("THis is static method:");
        
    }
    public void p2(){
        System.out.println("this is non static method:");
    }
}
class Rub{
    public static void r1(){
        System.out.println("value of static var a is:"+Pen.a);
        Pen.p1();
        Pen n=new Pen();
        System.out.println("Value of b nonstatic method is:"+n.b);
        n.p2();
    }
    public void r2(){
        System.out.println("This is non static method of Rub calss:");
        System.out.println("Value of a is:"+Pen.a);
        Pen.p1();
        Pen obj =new Pen();
        System.out.println("Value of nonstatic b"+obj.b);
        obj.p2();
    }
}

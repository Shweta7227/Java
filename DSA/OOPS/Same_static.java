
public class Same_static {
     public static void main(String [] args){
         Check1 ch=new Check1();
         Check1.staticfun();
    }
}
class Check1{
    static int a=10;
    int b=20;
    public static void staticfun(){
        System.out.println("value of static a is:"+a);//direct calling of a
        Check1 c=new Check1();
        System.out.println("value of nonstatic b:"+c.b);
//        c.nonstaticfun();
    }
    public void nonstaticfun(){
        System.out.println("value of static var is :"+a);
        System.out.println("Value of b nonstatic is:"+b);
        staticfun();
        nonstaticfun2();
    }
    public void nonstaticfun2()
    {
        System.out.println("i'm in the nonstaticfun2 function");
    }
    
}

}

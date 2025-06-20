
public class Largest {
     public static void main(String[] args)
    {
        Large l=new Large();
        int result=l.find(32,1,45);
        System.out.println("Largest among all is: "+result);
    }
}
class Large{
    public int max(int a,int b){
        return (a>b?a:b);
    }
    public int find(int a,int b,int c)
    {
        int t=this.max(a,b);
        return (t>c?t:c);
    }
}


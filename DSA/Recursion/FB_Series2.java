import java.util.Scanner;

public class FB_Series2 {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the nth value:");
        int nth=s.nextInt();
        System.out.println(" "+Series(nth));
    }
    public static int  Series(int n)
    {
        if(n==0)
        {

            return 0;

        }
        if(n==1)
        {
            return 1;
        }
        
        int sm =Series(n-1)+Series(n-2);
        return sm;
    }
    
}

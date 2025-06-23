import java.util.Scanner;

public class FB_series {
     public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the nth value:");
        int nth=s.nextInt();
        for(int i=0;i<nth;i++)
        {
            System.out.print(Series(i)+" ");
        }
        
    }
    public static int  Series(int n)
    {
        if(n==0)
        {
//            System.out.println(" "+0);
            return 0;
        }
        if(n==1)
        {
//            System.out.println(" "+1);
            return 1;
        }
        
        return Series(n-1)+Series(n-2);
        
  
    }
    
}

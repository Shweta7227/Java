import java.util.Scanner;

public class Exponent_optimized {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=s.nextInt();
        System.out.println("Enter the value of n:");
        int n=s.nextInt();
        System.out.println(Pow(x,n));
    }
    public static int Pow(int x,int n)
    {        if(n==0)
        {
            return 1;
        }
        if(n%2==0)
        {
            return Pow(x,n/2)*Pow(x,n/2);
        }
        return x*Pow(x,n/2)*Pow(x,n/2);
    }
    
}

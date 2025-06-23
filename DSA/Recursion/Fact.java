import java.util.Scanner;

public class Fact {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println("Factorial of the given number is: "+fun(n));
    }
    public static int fun(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 1;
           
        }
        int f ;//=fun(n-1);
         f=n*fun(n-1);
         return f;
    }
        
}

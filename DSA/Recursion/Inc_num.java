import java.util.Scanner;

public class Inc_num {
     public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println("\nNumbers are:");
        number1(n);
    }
    public static void number1(int n)
    {
        if(n==1)
        {
            System.out.println(n+" ");
            return;
        }
         number1(n-1);
        System.out.println(n+" ");
       
    }
}

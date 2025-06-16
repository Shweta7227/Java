import java.util.Scanner;

public class Clear_bit {
     public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println("Enter the ith position to clear the bit:");
        int i=s.nextInt();
        int bitmask=~(1<<i);
        System.out.println("Value we get is:"+(n&bitmask));
        
    }
}

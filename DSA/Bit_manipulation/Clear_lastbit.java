import java.util.Scanner;

public class Clear_lastbit {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println("Enter the position to clear the last bits:");
        int i=s.nextInt();
        int bitmask=((~0)<<i);
        System.out.println("Solution after clearing the last bit:"+(n&bitmask));
    }
}

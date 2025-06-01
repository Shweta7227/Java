// package Pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String [] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the  number of rows:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            
                //space
                for(int space=1;space<=n-i;space++)
                {
                    System.out.print("  ");
                }
                    
//                star
                for(int star=1;star<=i;star++)
                {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}

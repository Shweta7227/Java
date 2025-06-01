// package Pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
                //star
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

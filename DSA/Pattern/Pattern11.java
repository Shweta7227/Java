// package Pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            //space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            //stars
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("* ");
            }
                        System.out.println();

        }
        //bottom
        for(int i=n;i>=1;i--)
        {
            //space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            //stars
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("* ");
            }
                System.out.println();
        }
        
    }
}

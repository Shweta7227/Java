// package Pattern;

import java.util.Scanner;

public class Pattern9 {
     public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            //star
            for(int st=1;st<=i;st++)
            {
                System.out.print("* ");
            }
            //space
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print("  ");
            }
            //space
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print("  ");
            }
            //star
            for(int st=1;st<=i;st++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //bottom
        for(int i=n;i>=1;i--)
        {
            //star
            for(int st=1;st<=i;st++)
            {
                System.out.print("* ");
            }
            //space
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print("  ");
            }
            //space
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print("  ");
            }
            //star
            for(int st=1;st<=i;st++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

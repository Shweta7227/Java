// package Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String [] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number of rows:");
        int r=s.nextInt();
        System.out.println("Enter the number of col:");
        int c=s.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1 || j==1 || i==r || j==c)
                {
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

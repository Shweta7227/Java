// package Pattern;

import java.util.Scanner;

public class Pattern7 {
     public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=s.nextInt();
        int c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+++" ");
            }
            System.out.println();
        }
    }
}

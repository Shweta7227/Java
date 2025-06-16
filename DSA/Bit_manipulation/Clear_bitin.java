// package Bit_manipulation;

import java.util.Scanner;

public class Clear_bitin {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println("Enter the ith value :");
        int i=s.nextInt();
        System.out.println("Enter the jth value :");
        int j=s.nextInt();
        int a=(1<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        System.out.println("Solution is: "+(n&bitmask));
    }
}

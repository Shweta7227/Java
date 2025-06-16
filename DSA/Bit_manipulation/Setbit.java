// package Bit_manipulation;

import java.util.Scanner;

public class Setbit {
    public static void main(String [] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number :");
        int n=s.nextInt();
        System.out.println("Enter the ith position:");
        int i=s.nextInt(); 
        int bitmask=1<<i;
        System.out.println("Value is: "+(n|bitmask));
    }
}

// package Bit_manipulation;

import java.util.Scanner;

public class Getbit {
     public static void main(String [] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println("Enter the position to get bit:");
        int i=s.nextInt();
        int bitmask=1;
//        int bit=;
        if((n&(bitmask<<i))==0)
        {
            System.out.println("ith bit is: 0");
        }
        else
        {
            System.out.println("ith bit is: 1");

            
        }
//        System.out.println("bit at given position:"+bit);
    }
}

// package Bit_manipulation;

import java.util.Scanner;

public class Evenodd {
     public static void main(String [] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number :");
        int str=s.nextInt();
        int bitmask=1;
        if((str&bitmask)==0)
        {
            System.out.println("Number is even!!");
        }
        else
        {
            System.out.println("Number is odd!!");

        }
    }
}

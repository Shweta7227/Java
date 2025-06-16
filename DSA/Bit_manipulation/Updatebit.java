// package Bit_manipulation;

import java.util.Scanner;

public class Updatebit {
     public static void main(String [] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println("Enter the position :");
        int i=s.nextInt();
        System.out.println("Enter your choice:\n0--> Clear the ith bit\n1--> Set the ith bit");
        int ch=s.nextInt();
        n=Clearbit(n,i);
        int newbit=(ch<<i);
        if(ch==0)
        {
            //clear the bit
            
            System.out.println("Solution after clearing the "+i+"th bit is: "+(n|newbit));
            
        }
        else if(ch==1)
        {
            //set the bit

            System.out.println("Solution after setting the "+i+"th bit is: "+(n|newbit));
            
        }
        else
        {
            System.out.println("Yoou have entered the wrong choice!!");
        }
        
    }
    public static int Clearbit(int n,int i)
    {
        int bitmask=~(1<<i);
        return (n&bitmask);
    }
}

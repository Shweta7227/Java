// package Recursion;

import java.util.Scanner;

public class Exponent {
     public static void main(String [] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the value of X:");
        int x=s.nextInt();
        System.out.println("Enter the value of n:");
        int n=s.nextInt();
        System.out.println(Power(x,n));
        
    }
    public static int Power(int x,int n)
    {
           
        if(n==1){
            return x;
        }
        return x*Power(x,n-1);
    }
}

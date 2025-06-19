// package Recursion;

import java.util.Scanner;

public class Check_sorting {
     public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int a[] ={1,2,3,4,15};
        System.out.println(Check(a,0));
        
    }
    public static boolean Check(int a[],int i)
    {
        if(i==a.length-1)
        {
            return true;
        }
        if(a[i]>a[i+1])
            return false;
        
        return Check(a,i+1);
    }
}

// package Recursion;

import java.util.Scanner;

public class All_occurence {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int a[]={3,2,4,5,6,2,7,2,2};
        System.out.println("Enter the key value:");
        int key=s.nextInt();
        Find(a,0,key);
        System.out.println();
    }
    public static void Find(int a[],int i,int key)
    {
        if(i==a.length)
        {
            return;
        }
        if(a[i]==key)
        {
            System.out.print(i+" ");
            Find(a,i+1,key);
        }
        else{
            Find(a,i+1,key);
        }
    }
}

// package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println("String is:"+str);
        int flag=0;
        int i=0;
        int n=str.length();
        while(i<n)
        {
            if(str.charAt(i)!=str.charAt(n-i-1)){
                flag=1;
                break;
            }
            i++;
        }
        if(flag==0)
        {
            System.out.println("Palindrome!!");

        }
        else
        {
            System.out.println("Not palindrome!!");

        }
    }
}

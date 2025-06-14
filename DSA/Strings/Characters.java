// package Strings;

import java.util.Scanner;

public class Characters {
     public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println("String is:"+str);
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }
}

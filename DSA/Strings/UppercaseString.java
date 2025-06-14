// package Strings;

import java.util.Scanner;

public class UppercaseString {
     public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your String:");
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else
            {
                sb.append(str.charAt(i));
            }
        }
        System.out.println("String after uppercse is: "+sb.toString());
        
    }
}

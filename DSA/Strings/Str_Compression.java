// package Strings;

import java.util.Scanner;

public class Str_Compression {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your string");
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count >1)
            {
                sb.append(count.toString());
            }
        }
        System.out.println("Compressed string is: "+sb.toString());
    }
}

// package Strings;

public class SubString {
    public static void main(String [] args)
    {
        String str="Shweta Sindhu";
        
        for(int i=0;i<=5;i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("By function!!");
        System.out.println("Substring is:"+str.substring(0,6));
    }
}

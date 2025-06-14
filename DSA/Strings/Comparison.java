// package Strings;

public class Comparison {
       public static void main(String [] args)
    {
        String str = "Shweta";
        String str2="Shweta";//start pointing the previous same string
        String str1=new String("Shweta");
        if(str==str2)
        {
            System.out.println("These both are same by address");
        }
        else
        {
            System.out.println("These both are different by address");

        }
        if(str.equals(str2))
        {
            System.out.println("But both are same string ");
        }
        else
        {
            System.out.println("But both are different string ");
        }
    }
}

// package Strings;

public class Largest {
     public static void main(String [] args)
    {
        String fruits[]={"apple","Banana","mango"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++)
        {
            if(largest.compareToIgnoreCase(fruits[i])<0)
            {
                largest=fruits[i];
            }
        }
        System.out.println("Largest string is:"+largest);
    }
}

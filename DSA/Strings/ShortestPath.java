// package Strings;

public class ShortestPath {
     public static void main(String [] args)
    {
        String dis="WNEENESENNN";
        int x=0;
        int y=0;
        int i=0;
        while(i<dis.length())
        {
            char ch=dis.charAt(i);
            if(ch=='N')
            {
                y++;
            }
            else if(ch=='S')
            {
                y--;
            }
            else if(ch=='E')
            {
                x++;
            }
            else if(ch=='W')
            {
                x--;
            }
            i++;
        }
        int X2=x*x;
        int Y2=y*y;
        System.out.println("Result is: "+Math.sqrt(X2+Y2));
    }
}

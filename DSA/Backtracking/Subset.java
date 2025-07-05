public class Subset {
    public static void main(String [] args)
    {
        String str="abc";
        Possible(str,0,"");
        
    }
    public static void Possible(String str,int i, String ans)
    {
        if(i==str.length())
        {
            if(ans=="")
            {
                System.out.println("<empty>");
            }
            else
            {
                System.out.println(ans);
                
            }
//            display(str);
            return;
        }
            //recursion
            char current =str.charAt(i);
//            String newstr=str.substring(0, i)+str.substring(i+1);
            Possible(str, i+1,ans+current);
            //backtracking
            Possible(str,i+1,ans);
    }

}

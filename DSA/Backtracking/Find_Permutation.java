public class Find_Permutation {
    public static void main(String[] args)
    {
        String str="abc";
        Permutation(str,"");
    }
    public static void Permutation(String str,String ans)
    {
        //base condition
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++)
        {
            char current =str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            Permutation(newstr,ans+current);
            
        }

    }
}

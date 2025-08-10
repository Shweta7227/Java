public class Arrays_bkt {
    public static void main(String [] args)
    {
        
        int a[]=new int[5];
        
        Print(a,0,1);
        System.out.println("After backtracking:");
        Show(a);
    }
    public static void Print(int a[],int i,int val)
    {
//        int c=0;
        //base case
        if(i==a.length)
        {
            System.out.println("Before backtracking:");
            Show(a);
            return;
        }
            //recursion
        a[i]=val;
        Print(a,i+1,val+1);
        //backtracking
        a[i]=a[i]-2;
    }
    public static void Show(int a[])
    {
//        System.out.println("array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

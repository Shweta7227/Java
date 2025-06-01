// package OneDArray;

public class KadanesAlgo {
     public static void main(String[] args)
    {
        int a[]={1,-2,6,-1,3};
        int sum=0;
        int Max=a[0];
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(sum<0)
            {
                sum=0;
                Max=Math.max(Max, a[i]);
            }
            else
            {
                Max=Math.max(Max,sum);
            }
        }
        System.out.println("Max sum is:"+Max);
    }
}

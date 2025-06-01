// package OneDArray;

public class PrefixSum {
   /**
 * @param args
 */
public static void main(String [] args)
    {
        int a[]={1,-2,6,-1,3};
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            prefix[i]=prefix[i-1]+a[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int sum=0;
                sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(max<sum)
                {
                    max=sum;
                }
            }
        }
        System.out.println("Max subarray sum is:"+max);
    }
}

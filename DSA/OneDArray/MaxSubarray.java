// package OneDArray;

public class MaxSubarray {
     public static void main(String[] args)
    {
//        int current_sum=0;
        int sums=Integer.MIN_VALUE;
        int a[]={1,-2,6,-1,3};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                 int sum=0;
                for(int k=i;k<=j;k++)
                {
                   
                    sum+=a[k];
                }
                if(sums<sum)
                {
                    sums=sum;
                }
                
            }
            
        }
        System.out.println("Max sum of subarray is: "+sums);
    }
}

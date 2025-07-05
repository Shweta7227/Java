

public class Small_idx {
    public static void main(String [] args)
    {
        int a[]={1,3,2};
        int result=smallestIndex(a);
        System.out.println("Smallest index is:"+result);
    }
    public static int smallestIndex(int[] a) {
        int num=Integer.MAX_VALUE;
//        int sum=0;
        for(int i=0;i<a.length;i++)
            {
                int sum=0;
                int n=a[i];
                while(n!=0)
                    {
                        int mod=n%10;
                        sum+=mod;
                        n/=10;
                    }
                System.out.println("Sum of "+i+"index is "+sum);
                if(sum==i){
                    return i;
                    
                }
            }

            return -1;
        
        
    }
}


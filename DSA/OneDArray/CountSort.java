// package OneDArray;

public class CountSort {
     public static void main(String[] args)
    {
        int a[]={2,5,3,1,1,0,4};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            largest=Math.max(largest, a[i]);   
        }
        int count[]=new int[largest+1];
        for(int i=0;i<a.length;i++)
        {
            count[a[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                a[j++]=i;
                count[i]--;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

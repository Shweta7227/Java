// package OneDArray;

public class InsertionSort {
    public static void main(String [] args)
    {
        int a[]={5,4,1,3,2};
        for(int i=0;i<a.length-1;i++)
        {
            int temp=a[i];
            int j=0;
            for(;j>=0&&temp<a[i];j--)
            {
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}

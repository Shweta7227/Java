// package OneDArray;

public class SelectionSort {

       public static void main(String [] args)
    {
        int a[]={5,4,1,3,2};
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                    
                }
            }
            if(min!=i)
            {
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        } 
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);

        }
                    
    }
}

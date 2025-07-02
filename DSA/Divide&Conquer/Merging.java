
public class Merging {
     public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the values in an array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Entered values are:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        MergeSort(a,0,a.length-1);
        System.out.println("Sorted array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void MergeSort(int a[],int l,int u)
    {
        if(l>=u)//base case
        {
            return;
        }
        int mid=l+(u-l)/2;
        MergeSort(a,l,mid);
        MergeSort(a,mid+1,u);
        Merge(a,l,mid,u);
    }
    public static void Merge(int a[],int l,int mid,int u)
    {
        int temp[]=new int[u-l+1];
        int k=0;
        int i=l;
        int j=mid+1;
        while(i<=mid && j<=u)
        {
            if(a[i]<a[j])
            {
                temp[k++]=a[i++];
            }
            else
            {
                temp[k++]=a[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=a[i++];
        }
        while(j<=u)
        {
            temp[k++]=a[j++];
        }
        for(k=0;k<temp.length;k++)
        {
            a[l+k]=temp[k];
        }
    }
}

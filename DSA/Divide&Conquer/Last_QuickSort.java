public class Last_QuickSort {
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
        L_QuickSort(a,0,a.length-1);
        System.out.println("Sorted array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void L_QuickSort(int a[],int l,int u)
    {
        if(l>=u)
        {
            return;
        }
        int j=Partition(a,l,u);
        L_QuickSort(a,l,j-1);
        L_QuickSort(a,j+1,u);

    }
    public static int Partition(int a[],int l,int u)
    {
        int i=l-1;
        int j=l;
        int temp;
        int x=a[u];
        while(j<u)
        {
            if(a[j]<x)
            {
                temp=a[i+1];
                a[i+1]=a[j];
                a[j]=temp;
                i++;
            }
            j++;
        }
        temp=a[i+1];
        a[i+1]=a[u];
        a[u]=temp;
        i++;
        return i;
    }
}

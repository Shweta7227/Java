

public class First_Quicksorting {
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
        F_QuickSort(a,0,a.length-1);
        System.out.println("Sorted array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void F_QuickSort(int a[],int l,int u)
    {
        if(l>=u)
        {
            return;
        }
        int j=Partition1(a,l,u);
        F_QuickSort(a,l,j-1);
        F_QuickSort(a,j+1,u);

    }
    public static int Partition1(int a[],int l,int u)
    {
        int i=l+1;
        int j=u;
        int temp;
        int x=a[l];
        while(i<=j)
        {
            while((i<=u)&&(a[i]<x) )
            {
                i++;
            }
            while((j >= l) && (a[j]>x))
            {
                j--;
            }
            if(i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        temp=a[j];
        a[j]=a[l];
        a[l]=temp;
        return j;
    }
}

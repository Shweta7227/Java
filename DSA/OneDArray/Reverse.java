// package OneDArray;

public class Reverse {
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50,60};
//        int l=0;
        int n=a.length-1;
        int i=0;
        while(i<=n/2)
        {
            int temp=a[i];
            a[i]=a[n-i];
            a[n-i]=temp;
            i++;
            
        }
        for(int l=0;l<a.length;l++)
        {
            System.out.print(a[l]+" ");
        }
    }
}

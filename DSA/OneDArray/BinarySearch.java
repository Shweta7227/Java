// package OneDArray;

public class BinarySearch {
    public static void main(String [] args)
    {
        int a[]={10,20,30,40,50};
        int key=20;
        System.out.println(Search(a,key));
    }
    public static int Search(int a[],int key)
    {
        int l=0;
        int u=a.length-1;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(a[mid]==key)
            {
                return mid;
            }
            else if(a[mid]<key)
            {
                l=mid+1;
            }
            else if(a[mid]>key)
            {
                u=mid-1;
            }
        }
        return -1;
    }
}

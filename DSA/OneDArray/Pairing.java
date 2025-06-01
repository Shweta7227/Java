// package OneDArray;

public class Pairing {
    public static void main(String[] args)
    {
        int a[]={10,20,40,50,60};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                System.out.print(" "+a[i]+","+a[j]);
            }
            System.out.println();
        }
    }
}

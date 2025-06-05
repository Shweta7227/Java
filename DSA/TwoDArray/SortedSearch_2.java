// package TwoDArray;

public class SortedSearch_2 {
     public static void main(String[] args)
    {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=16  ;
        int flag=0;
        int i=a.length-1;
        int j=0;
        while(j<=a[0].length-1 && i>=0)
        {
            if(a[i][j]==key)
            {
                flag=1;
                break;
            }
            else if(key<a[i][j])
            {
                i--;
            }
            else if(key>a[i][j])
            {
                j++;
            }
        }
        if(flag==0)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("found");

        }
        
    }
}

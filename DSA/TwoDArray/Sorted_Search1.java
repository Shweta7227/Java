// package TwoDArray;

public class Sorted_Search1 {
     public static void main(String[] args)
    {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=160;
        int flag=0;
        int i=0;
        int j=a[0].length-1;
        while(i<=a.length-1 && j>=0)
        {
            if(a[i][j]==key)
            {
                flag=1;
                break;
            }
            else if(key<a[i][j])
            {
                j--;
            }
            else if(key>a[i][j])
            {
                i++;
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

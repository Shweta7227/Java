// package TwoDArray;

public class SpiralMatrix {
     public static void main(String [] args)
    {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Matrix is:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int startrow=0;
        int startcol=0;
        int endrow=a.length-1;
        int endcol=a[0].length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            //top
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.print(a[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(a[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--)
            {
                System.out.print(a[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                System.out.print(a[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }
}

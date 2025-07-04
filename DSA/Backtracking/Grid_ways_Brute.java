public class Grid_ways_Brute {
    public static void main(String[] args)
    {
        int n=3;int m=3;
        int way=Grid(0,0,n,m);
        System.out.println("Total ways are:"+way);
    }
    public static int Grid(int i,int j,int n,int m)
    {
        if(i==(n-1) && j==(m-1))
        {
            return 1;
        }
        else if(i==n || j==m)
        {
            return 0;
        }
        int way1=Grid(i+1,j,n,m);
        int way2=Grid(i,j+1,n,m);
        return way1+way2;
    }
}

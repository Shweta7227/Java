public class Count_Q_sol {
    static int count=0;
    public static void main(String[] args)
    {
        int n=4;
        char board[][]=new char[n][n];
//        System.out.println("Enter the numb")
         //intialization
         for(int i=0;i<board.length;i++)
         {
             for(int j=0;j<board.length;j++)
             {
                 board[i][j]='X';
             }
//             System.out.println();
         }
         
        NQueen(board,0);
        System.out.println("Total possible solution are: "+count);
    }
    public static boolean isSafe(char board[][],int row,int col)
    {
        //vertical up
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
                return false;
        }
        //diagonal left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        //diagonal right
        for(int i=row-1,j=col+1;i>=0&&j<=board.length-1;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    public static void NQueen(char board[][],int row)
    {
        //base case
        if(row==board.length)
        {
//            PrintN(board);
            count++;
            return;
        }
        for(int j=0;j<board[0].length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                NQueen(board,row+1);
                board[row][j]='X';
                
            }
            
        }
    }
    public static void PrintN(char board[][])
    {
        System.out.println("-------Chess Board------");
        for(int i=0;i<board.length;i++)
         {
             for(int j=0;j<board.length;j++)
             {
                System.out.print(board[i][j]+" ");
             }
             System.out.println();
         }
    }
}

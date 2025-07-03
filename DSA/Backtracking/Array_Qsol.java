
public class Array_Qsol {
    public static void main(String[] args) {
        int n = 4;
        int[] positions = new int[n]; // Array to store queen positions
        //initialization of array
        for (int i = 0; i < n; i++) 
        {
            positions[i] = -1;
        }

        System.out.println("All solutions for " + n + "-Queens problem:");
        solveNQueens(n, positions, 0);
    }

    public static void solveNQueens(int n, int[] positions, int row) {
        if (row == n) {
            printSolution(positions);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(positions, row, col)) {
                positions[row] = col;
                solveNQueens(n, positions, row + 1);
                positions[row] = -1; // Backtrack
            }
        }
    }

    public static boolean isSafe(int[] positions, int row, int col) {
        for (int i = 0; i < row; i++) {
            int prevCol = positions[i];
            if (prevCol == col || Math.abs(prevCol - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
    public static void printSolution(int[] positions) {
        System.out.print("[");
        for (int i = 0; i < positions.length; i++) {
            System.out.print(positions[i]);
            if (i < positions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

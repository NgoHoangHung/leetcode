package a_easy;

public class A2373_Largest_Local_Values_in_a_Matrix {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        if (n == 3) {
            int[][] a = new int[1][1];
            a[0][0] = maxValue(grid);
            return a;
        } else {
            int[][] resul = new int[n - 2][n - 2];
            for (int i = 0; i < resul.length; i++) {
                for (int j = 0; j < resul.length; j++) {
                    resul[i][j] = maxValue(grid, i, j);
                }
            }
            return resul;
        }
    }

    public int maxValue(int[][] grid) {
        int max = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (max < anInt) max = anInt;
            }
        }
        return max;
    }

    public int maxValue(int[][] grid, int row, int column) {
        int max = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                if (max < grid[i][j]) max = grid[i][j];
            }
        }
        return max;
    }
}

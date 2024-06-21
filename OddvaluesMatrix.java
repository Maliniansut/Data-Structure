import java.util.*;

public class OddvaluesMatrix {

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};

        int oddCount = oddCellsCount(m, n, indices);
        System.out.println("Number of odd-valued cells: " + oddCount);
    }

    public static int oddCellsCount(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        // Apply increments based on indices
        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];

            // Increment all cells in row row
            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }

            // Increment all cells in column col
            for (int i = 0; i < m; i++) {
                matrix[i][col]++;
            }
        }

        // Count odd-valued cells
        int oddCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}


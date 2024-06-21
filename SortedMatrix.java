import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    // We are searching in individual rows, so we need one more method
    static int[] binarysearch(int[][] matrix, int row, int colstart, int colend, int target) {
        while (colstart <= colend) {
            int mid = colstart + (colend - colstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                colstart = mid + 1;
            } else {
                colend = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // matrix can be of one dimension only.

        if (rows == 1) {
            return binarysearch(matrix, 0, 0, cols - 1, target);
        }

        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols / 2;

        // Run loop till 2 rows are remaining
        while (rstart < rend - 1) { // here we would have more than two rows which we are trying to eliminate
            int mid = rstart + (rend - rstart) / 2;
            if (matrix[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (matrix[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }

        // Now we would have two rows
        // Check whether the target is in the col of 2 rows
        if (matrix[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if (matrix[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }

        // Search in 1st half
        if (target <= matrix[rstart][cmid - 1]) {
            return binarysearch(matrix, rstart, 0, cmid - 1, target);
        }
        // Search in 2nd half
        if (target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][cols - 1]) {
            return binarysearch(matrix, rstart, cmid + 1, cols - 1, target);
        }
        // Search in 3rd half
        if (target <= matrix[rstart + 1][cmid - 1]) {
            return binarysearch(matrix, rstart + 1, 0, cmid - 1, target);
        }
        // Search in 4th half
        if (target >= matrix[rstart + 1][cmid + 1]) {
            return binarysearch(matrix, rstart + 1, cmid + 1, cols - 1, target);
        }

        // If the element is not found
        return new int[]{-1, -1};
    }
}

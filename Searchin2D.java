import java.util.*;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
            {23, 14, 15},
            {34, 22, 13},
            {89, 90},
            {56, 65, 45, 54}
        };
        int target = 22;
        int[] answer = search(arr, target);
        System.out.println(Arrays.toString(answer));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}


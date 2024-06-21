import java.util.Arrays;

public class UniqueIntegers {
    public static void main(String[] args) {
        int n=10;
        int[] result=SumZero(n);
        System.out.println(n+" "+Arrays.toString(result));
    }
    public static int[] SumZero(int n){
        int[] result = new int[n];
        int sum = 0;

        // Fill the array with n-1 elements such that their sum is balanced
        for (int i = 0; i < n - 1; i++) {
            // Assign values symmetrically around zero
            result[i] = i - (n / 2);
            // Accumulate the sum
            sum += result[i];
        }

        // Adjust the last element to make the sum zero
        result[n - 1] = -sum;
        return result;

    }
}

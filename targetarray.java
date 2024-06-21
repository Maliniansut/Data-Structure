import java.util.ArrayList;
import java.util.List;

public class targetarray {

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int idx = index[i];
            target.add(idx, num); // Insert num at index idx
        }

        // Convert List<Integer> to int[]
        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] targetArray = createTargetArray(nums, index);

        // Print the result
        System.out.print("Target Array: ");
        for (int num : targetArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


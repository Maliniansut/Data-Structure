public class MissingPositive {
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // Calculate the correct index for arr[i]
            // Check if arr[i] is a positive number and within the bounds
            // Also check if arr[i] is not already in its correct position
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // Search for the first missing positive number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) { // Check if index+1 is not equal to the value at index
                return index + 1;
            }
        }
        return arr.length + 1; // If all positions are correct, return length+1
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(missingNumber(arr)); // Output should be 2
    }
}


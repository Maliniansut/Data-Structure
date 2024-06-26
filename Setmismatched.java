public class Setmismatched {

    public static int[] findMismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] { arr[index], index + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 6, 1};
        int[] result = findMismatch(arr);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}


public class InvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        
        // Step 1: Flip each row horizontally
        for (int[] row : image) {
            reverse(row);
        }
        
        // Step 2: Invert the flipped image
        for (int[] row : image) {
            invert(row);
        }
        
        return image;
    }
    
    // Helper method to reverse a row
    private void reverse(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
    
    // Helper method to invert a row
    private void invert(int[] row) {
        for (int i = 0; i < row.length; i++) {
            row[i] = row[i] == 0 ? 1 : 0;
        }
    }
    
    // Example usage
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };
        
        final InvertImage solution = new InvertImage();
        int[][] result = solution.flipAndInvertImage(image);
        
        // Print the result for verification
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


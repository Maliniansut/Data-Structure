public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);
    }
    public static int[][] transpose(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;

        int[][] transpose= new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++ ){
                transpose[i][j]=matrix[i][j];
            }
        }
        return transpose;
    }
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){ //j<matrix[i].length as number of cols and rows acn be different depending upon the matrix 
                System.out.println("Matrix is:" + matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

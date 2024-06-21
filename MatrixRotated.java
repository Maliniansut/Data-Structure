public class MatrixRotated {
    public static void main(String[] args) {
        int[][] mat = {
            {0, 1},
            {1, 0}
        };
        int[][] target = {
            {1, 0},
            {0, 1}
        };

        boolean result = findRotation(mat, target);
        System.out.println("Can mat be rotated to match target? " + result);
    }

    public static boolean findRotation(int[][] mat,int[][] target){
        for(int i=0;i<4;i++){
            if(isSame(mat, target)){
                return true;
            }
            mat=rotated90(mat);
        }return false;
    }

    //if they are same we need to check if each element is same or not.

    public static boolean isSame(int[][] mat,int[][] target){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }return true;
    }

    //rotating the matrix by 90 degrees
    public static int[][] rotated90(int[][] mat){
        int n=mat.length;
        int[][] rotated = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-1-i]=mat[i][j];
            }
        }
        return rotated;
    }
}

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class DiagonalOfMatrix {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int sum = DiagonalSum(mat);
        System.out.println("Sum of Diagonal of matrix is:"+ sum);
    }
    public static int DiagonalSum(int[][] mat){
        int n=mat.length;
        int sum=0;

        //Primary Diagonal
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
        }

        //Secondary Diagonal
        for(int i=0;i<n;i++){
            //column index(i+j==n-1)
            int j=n-1-i;
            //avoid intersection point
            if(i!=j){
                sum+=mat[i][j];
            }
        }
        return sum;
        

    }
}

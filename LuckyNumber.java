import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public List<Integer> luckyNumbers(int[][] matrix){
        List<Integer> arr= new ArrayList<>();
        //chceking for minimum number 
        for(int i=0;i<matrix.length;i++){
            int minIndex=0;
            int min=99999;
            for(int j=0;j<matrix.length;j++){
                if((matrix[i][j]<min)){
                    min=matrix[i][j];
                    minIndex=j;
                }
            }
            boolean isTrue=true;
            for(int j=0;j<matrix[i].length;j++){
                //checking if the minimum value in the row is minimum in the column or not
                if(matrix[i][minIndex]<matrix[j][minIndex]){
                    isTrue=false;
                    break;
                }
            }
            if(isTrue){
                arr.add(matrix[i][minIndex]);
            }
        }
        return arr;
    }
}

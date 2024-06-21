import java.util.*;
public class mutlidimensionalarray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[][] arr = new int[3][]; //size of column not necessary to be specified
        /*int[][] arr2={
            {1,2,3},
            {4,5},
            {7,8,9}
        };*/
        //input 
        int[][] arr=new int[3][3];
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            //for each col in every row
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
    }
        //output
        /*for(int i=0;i<arr.length;i++){
        //for each col in every row
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        /*for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }*/

        //enhanced for loop for outer array
        //datatype of an array is array itself now not integer 1
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }


}

package Recurssion_Level_2;

public class Sorted_array {
    public static void main(String[] args) {
        int[] arr ={1,2,5,3,7,9,4};
        System.out.println(sorted(arr, 0));
    }
    static boolean sorted(int[] arr, int index){
        //base condition
        if(index==arr.length-1){
            return true;
        }
        //pass by the value of object
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}

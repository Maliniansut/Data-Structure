import java.util.Arrays;

public class bubblesort1 {
    public static void main(String[] args) {
        int[] arr={-36,-2,0,-23,69,1,7};
        bubble(arr);
        System .out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //Running the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //for each pass the maximum item would go at the end
            for(int j=1;j<arr.length-i;j++){
                //swap if the currentnumber is less than the previous number
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                    //if swap is taking place then swapped==true
                    swapped=true;
                }
            }
            //if swap did not happen it means its already sorted hence break the loop
            if(swapped==false){//or (!swapped)
                break;
            }


        }
        //if array is sorted already then no swapping is going to occur hence lets break the loop

    }
}

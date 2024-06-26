import java.util.Arrays;

public class selectionsort {
        public static void main(String[] args) {
            int[] arr={-36,-2,0,-23,69,1,7};
            selection(arr);
            System .out.println(Arrays.toString(arr));
        }
        static void selection(int[] arr){
            for(int i=0;i<arr.length;i++){
                //Step1: Find the maximum item in the remaining array
                //Step2: Swapthe maximum item with the correct index
                int last= arr.length-i-1;
                int maxIndex=getmaxindex(arr,0,last);
                swap(arr, maxIndex,last);//if it find maximum swap the maxindex with last
            }
        }

        static void swap(int[] arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;

        }

        static int getmaxindex(int[] arr, int start, int end) {
           int max= start;
           for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
           }
           return max;
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
    

public class floor {
    public static void main(String[] args){
        int[] arr={2,3,4,12,13,16,17,18};
        int target =15;
        //if there is any number which is not greater then it would return the end index
        int ans=floor(arr, target);
        System.out.println(ans);
    }

    //return the index 
    static int floor(int[] arr, int target){
        int start=0;
        int end= arr.length-1;


        //middle element 
        while(start<=end){ //statrt :10 end :10
            //int mid = (start+end)/2;// might be possible that (start+end) exceed range of integer in java 
            int mid=start+(end-start)/2; //start:7 end:12 mid:9
            if(target<arr[mid]){
                end=mid-1; //end :12 start :11
            }
            else if(target>arr[mid]){
                start= mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}

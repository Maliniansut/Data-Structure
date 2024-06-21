public class ceiling_of_number {
    public static void main(String[] args){
        int[] arr={4,5,6,7,8,9,11,13,14,15,16,18};
        int target =17;
        int ans=ceiling_of_number(arr, target);
        System.out.println(ans);
    }

    //return the index 
    static int ceiling_of_number(int[] arr, int target){
        //but what if target is greater than the greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;
        }
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
        return start;
    }
}

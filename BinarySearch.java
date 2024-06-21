public class BinarySearch {
    public static void main(String[] args){
        int[] arr={-18,-11,-3,0,2,4,5,6,7,9,11,13,14,16,18};
        int ans=Binary_Search(arr, -18);
        System.out.println(ans);
    }

    //return the index 
    static int Binary_Search(int[] arr, int target){
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
        return -1;
    }
}
 
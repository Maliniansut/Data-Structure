public class infinitearray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println((ans(arr, target)));

    }
    static int ans(int[] arr, int target){
        //first start with range of 2 
        int start =0;
        int end=1;

        //condition for the target to lie in the range 
        while(target>arr[end]){
            int newStart= end+1;//this is for example tempory var
            //incerease value of array chunk exponentially
            //end =previous end +sizeofbox*2
            end=end +(end-start+1)*2;
            start = newStart;
        }
        return Binary_Search(arr, target, start, end);
    }
    static int Binary_Search(int[] arr, int target,int start , int end){


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

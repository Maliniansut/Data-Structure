public class OrderAgnosticsBS {
    public static void main(String[] args){
        //int[] arr={-18,-11,-3,0,2,4,5,6,7,9,11,13,14,16,18};
        int[] arr={10,9,8,7,6,5,4,3,2,1,0};
        int target=5;
        int ans=orderAgnostics(arr, target);
        System.out.println(ans);
    }
    static int orderAgnostics(int[] arr, int target){
        int start=0;
        int end =arr.length-1;
//finding that array is sorted in which order 
        boolean isAsc;
        if(arr[start]< arr[end]){
            isAsc=true;
        }
        else{
            isAsc= false;
        }

        while(start<=end){ 
            int mid=start+(end-start)/2; 
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1; 
                }
                else {
                    start= mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1; 
                }
                else {
                    start= mid+1;
                }
            }
        }
        return -1;
    }
}

public class SearchInMountain {
    public static void main(String[] args) {
        
    }
    int search(int[] arr, int target){
        int peak =peekIndexInMountainArray(arr);
        int firstTry =orderAgnostics(arr,target,0,peak);
        if(firstTry !=-1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnostics(arr, target, target, firstTry);

    }
    public int peekIndexInMountainArray(int[] arr){
        int start=0;
        int end= arr.length-1;

        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]> arr[mid+1]){
                end = mid; 
            }
            else{
                start = mid+1;
            }
        }
        return start; 
    }

    static int orderAgnostics(int[] arr, int target,int start, int end){
    
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
    static int Binary_Search(int[] arr, int target){
        int start=0;
        int end= arr.length-1; 
        while(start<=end){
            int mid=start+(end-start)/2; 
            if(target<arr[mid]){
                end=mid-1; 
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

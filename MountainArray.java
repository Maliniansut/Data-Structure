public class MountainArray {
    public static void main(String[] args) {
        
    }

    public int peekIndexInMountainArray(int[] arr){
        int start=0;
        int end= arr.length-1;

        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]> arr[mid+1]){
                //you are in decreasing part of array
                //this may be the answer ,but look at left
                end = mid; //thisiswhy end!=mid-1
            }
            else{
                start = mid+1;
                //beacuswe we know that mid+1 element > mid element
            }
        }
        //in the end ,start==end and poiting to largest number 
        /*start and end always find max element ,hence when they are 
         * pointing the same element means they have performed all checks
        */
        return start; //or return end as both are on same element

    }
}

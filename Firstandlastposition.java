public class Firstandlastposition {
    public static void main(String[] args){

    }
    public int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
        ans[0]= search(nums,target,true);
        if(ans[0]!=-1){
            ans[1]= search(nums, target, false);
        }
        //trying to find out end value hence findstartindex ==false
        
        return ans;
    }
    int search(int[] nums,int target, boolean findstartindex){
        int ans =-1;
        int start=0;
        int end= nums.length-1;
        while(start<=end){ 
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1; 
            }
            else if(target>nums[mid]){
                start= mid+1;
            }
            else {
                ans= mid;
                if(findstartindex==true){//findsatrtindex isitself boolean so has value true or false of its own so
                    //findsatrtindex== true can be findstartindex
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
  
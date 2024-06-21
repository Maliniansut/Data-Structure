public class Runningsum {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int currentSum=0;
        for(int i =0;i<nums.length;i++){
            currentSum=currentSum+nums[i];
            runningSum[i]= currentSum;
        }
        return runningSum;
    }
    public static void main(String[] args) {
        Runningsum s= new Runningsum();
        int[] nums={1,2,3,4,5,6};
        int[] res=s.runningSum(nums);
        for(int num : res){
            System.out.println(nums+" ");
        }
    }
}

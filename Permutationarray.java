import java.util.Arrays;

public class Permutationarray {
    public static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length; i++){
            ans[i] =nums[nums[i]];
        }
        return ans;
    
    }
    public static void main(String[] args){
    int[] nums ={2,3,4,5,6};
    int [] ans = buildArray(nums);
    System.out.println("NewArray:"+Arrays.toString(ans));
    }
}

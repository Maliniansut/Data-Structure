public class ConcatenationofArray {
    public int[] getConcatenation(int[] nums){
        int n=nums.length;
        int[] ans = new int[2*n];

        for(int i =0; i<n;i++){
            ans[i]=nums[i];
            ans[i+n]= nums[i];
        }
        return ans;
    }
    public static void main(String[] args){
        ConcatenationofArray c=new ConcatenationofArray();
        int[] nums={1,3,2,1};
        int[] ConcatenationofArray = c.getConcatenation(nums);
        System.out.println("Concatenated Array");

        for(int num:ConcatenationofArray){
            System.out.println(num+" ");
        } 
    }
}

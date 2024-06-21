public class ShuffleofArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result =new int[2*n];

        for(int i=0;i<n;i++){
            result[2*i]=nums[i];
            result[2*i+1]=nums[n+i];
        }
        return result;
    }
    public static void main(String[] args) {
        ShuffleofArray s= new ShuffleofArray();
        int[] nums ={1,2,3,4,5,6};
        int n=nums.length/2; //Dividing the whole array into two parts
        int[] result=s.shuffle(nums, n);
        for(int num: result){
            System.out.println(num+"");
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared {
    

    public List<Integer> finddisappearednumbers(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i] !=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        //just find missing numbers
        //using interfaces 
        List<Integer> ans = new ArrayList<>();
        for(int index =0;index<nums.length;index++){
            if(nums[index] !=index+1){
                ans.add(index+1);//if index no. 4 does not contain 5 that means it is missing.
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

public class linearSearch {
    public static void main(String[] args){
        int[] nums={23,45,67,89,56,69,34,18,-3,-2,90,-11};
        int target =90;
        boolean ans =linearsearch(nums, target);
        System.out.println(ans);
    }   

//search in array: return the index if item found
//otherwise return -1

    /*static int  linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        /*for(int index =0;index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }*/

        /*for(int element:arr){
            if(element == target){
                return element;
            }
        }return -1;*/

        static boolean linearsearch(int[] arr, int target){
            if(arr.length==0){
                return false;
            }

        for(int element:arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}



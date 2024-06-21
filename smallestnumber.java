public class smallestnumber {
    public static void main(String[] args){
     
    }

    //return the index 
    static int ceiling_of_number(int[] letters, int target){
        //but what if target is greater than the greatest number in the array
        /*if(target>letters[letters.length-1]){
            return -1;
        }*/
        int start=0;
        int end= letters.length-1;


        //middle element 
        while(start<=end){ //statrt :10 end :10
            //int mid = (start+end)/2;// might be possible that (start+end) exceed range of integer in java 
            int mid=start+(end-start)/2; //start:7 end:12 mid:9
            if(target<letters[mid]){
                end=mid-1; //end :12 start :11
            }
            else if(target>letters[mid]){
                start= mid+1;
            }
            else {
                return mid;
            }
        }
        return letters[start % letters.length];
    }
}

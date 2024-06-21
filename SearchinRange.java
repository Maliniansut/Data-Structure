public class SearchinRange {
    public static void main(String[] args){
        int[] arr ={23, 16 ,26,78, 90,89,69, 22};
        int target=6;
        System.out.println(linearsearch(arr, target, 1, 7));

    }
    static int  linearsearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }

        for(int index =start;index<end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return target;
    }
}

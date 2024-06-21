public class Max {
    public static void main(String[] args) {
        int[] arr={1,3,23,55,108};
        System.out.print(maxRange(arr, 1, 3));
    }
    /*static int max (int[] arr) {
        int maxValue=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;*/
        static int maxRange (int[] arr , int start, int end) {
            if(end>start){
                return -1;
            }
            if(arr== null){
                return 0;
            }
            if(arr.length==0){
                return 1;
            }
            int maxValue=arr[start];
            for (int i=start;i<end;i++){
                if(arr[i]>maxValue){
                    maxValue=arr[i];
                }
            }
            return maxValue;
    }
}

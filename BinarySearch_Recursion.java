public class BinarySearch_Recursion{
    public static void main(String[] args) {
        int[] arr ={1,22,18,14,12,13};
        int target=13;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search(int[] arr, int target,int s, int e){
        /*int s=0;
        int e=arr.length-1;
        for passing these to future arguments take then in arguments of method.
        */
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}
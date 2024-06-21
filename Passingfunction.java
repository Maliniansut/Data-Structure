import java.util.*;
public class Passingfunction {
    public static void main(String[] args){
        int[] n={22,18,1,14,13};
        System.out.println(Arrays.toString(n));
        change(n);
        System.out.println(Arrays.toString(n));
    }
    static void change(int[] arr){
        arr[4]=99;
    }
}

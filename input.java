import java.util.*;
public class input {
    public static void main(String[] args) {
        //int arr[] = {45,67,8,90,76,69};
        //System.out.println(arr[3]);
        Scanner in=new Scanner(System.in);
        //Array of primitives
        int[] arr = new int[5];
        arr[0] =23;
        arr[1]=45;
        arr[2]=18;
        arr[3]=1;
        arr[4]=98;
        System.out.println(arr[4]);

        for(int i=0;i<arr.length; i++){
            arr[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        //converts array into string ..internally using for loop


        //for each loop
        for(int num:arr){//num represents elements of array
            System.out.println(num+" ");
        }
        //System.out.println(arr[5]); index out of bound error 
        //Array of objects 
        String[] str=new String[4];//stroing reference objects in heap
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
    
    }

}

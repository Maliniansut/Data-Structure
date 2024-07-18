package Recurssion_Level_1;

import java.util.Arrays;

public class SpecialArrayTriangle {
    public static void main(String[] args) {
        int[] ArrayTri={1,2,3,4,5,6};
        printTriangle(ArrayTri);
    }
    public static void printTriangle(int[] ArrayTri){
        if(ArrayTri.length<0){
            return;
        }
        //array which conatins sum of consecutive elements
        int[] temp = new int[ArrayTri.length -1];
        for(int i=0;i<ArrayTri.length-1;i++){
            int x= ArrayTri[i] +ArrayTri[i+1];
            temp[i]=x;
        }

        //recursive call and pass a newly created array
        printTriangle(temp);

        System.out.println(Arrays.toString(ArrayTri));
    }
}

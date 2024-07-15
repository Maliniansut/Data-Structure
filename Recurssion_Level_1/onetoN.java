package Recurssion_Level_1;

public class onetoN {
    public static void main(String[] args) {
        printboth(5);
        //reversefun(5);
    }
    /*static void reversefun(int n){
        if(n==0){
            return;
        }
        reversefun(n-1);
        System.out.println(n);
    }*/
    static void printboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printboth(n-1);
        System.out.println(n);
    }

}
  
package Recurssion_Level_1;

public class passingnumber {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n--);
    }
}

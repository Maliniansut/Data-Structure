package Recurssion_Level_1;

public class sum {
    public static void main(String[] args) {
        int ans=Sum(5);
        System.out.println(ans);
    }
    static int Sum(int m){
        if(m<=1){
            return 1;
        }
        return m+Sum(m-1);
    }
}

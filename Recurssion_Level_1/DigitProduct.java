package Recurssion_Level_1;

public class DigitProduct {
    public static void main(String[] args) {
        int ans=product(22);
        System.out.println(ans);
    }
    static int product(int m ){
        if(m%10==m){
            return m;

        }
        return(m%10) *product(m/10);
    }
}

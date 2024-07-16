package Recurssion_Level_1;

public class NumberOfSteps {
    public static void main(String[] args) {
        
    }
    public int numofSteps(int num){
        return helper(num,0);
    }
    private int helper(int num, int i) {
        if(num==0){
            return i;
        }
        if(num%2==0){
            return helper(num/2,i+1);
        }
        return helper(num-1,i+1);

    }

    
}

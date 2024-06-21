public class MaximumWealth {
    public static void main(String[] args){

    }
    public static int Maximumwealth(int[][] accounts){
        int ans =Integer.MIN_VALUE;
        for(int p=0; p<accounts.length;p++){
            int sum=0;
            for(int account=0; account<accounts[p].length;account++){
                sum+=accounts[p][account];
            }
            if (sum>ans){
                ans=sum;
            }
        }
        return ans;
    }

}

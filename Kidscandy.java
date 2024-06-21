import java.util.ArrayList;
import java.util.List;

public class Kidscandy {
    public static List<Boolean> kidswithCandies(int[] candies, int extracandies){
        int maxCandies=Integer.MIN_VALUE;
        for(int candy: candies){
            maxCandies=Math.max(maxCandies, candy);
        }

        List<Boolean> result = new ArrayList<>();
        //check if adding extracandies can make each kid have maximum candies
        for(int candy: candies){
            result.add(candy +extracandies>=maxCandies);
        }
        return result;
    }
    public static void main(String[] args){
        int[] candies={2,3,4,6,7,1};
        int extracandies=3;
        List<Boolean> result = kidswithCandies(candies, extracandies);

        System.out.println(result); 
    }
}

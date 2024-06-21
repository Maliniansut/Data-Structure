import java.util.Arrays;

public class maximumpopulationyear {
    public static void main(String[] args) {
        int[][] logs= {{1950,1961},{1960,1971},{1970,1981}};
        int earliestyear=maximumPopulation(logs);
        System.out.println("Maxnimumpopluation year:"+earliestyear);
    }

    public  static  int maximumPopulation(int[][] logs) {
        int[] events =new int[logs.length *2];
        /*if logs.length is 5 (indicating 5 persons), then logs.length * 2 would be 10, allowing us to store 10 events (5 births and 5 deaths).*/

        //logs into event
        for(int[] log:logs){
            int birth=log[0]++; //retriving the birth year of current person
            int death =log[1]--;//retriving the death year of same person
        }

        Arrays.sort(events);

        int maxPopulation=0;
        int currentpopulation=0;
        int earliestyear=0;


        for(int e: events){
            //birth
            if(e>=0){
                currentpopulation++;
                if(currentpopulation> maxPopulation){
                    maxPopulation=currentpopulation;
                    earliestyear=e;
                }
            }
            //death
            else{
                currentpopulation--;
            }

        }return earliestyear;
        
    }


}


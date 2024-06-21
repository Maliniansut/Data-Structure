public class BikerAltitude {
    public static void main(String[] args) {
        int[] gain ={-5,1,5,0,-1};
        int largestAltitude = largestAltitude(gain);
        System.out.println("Highest Altitude Gain is"+ gain);
    }
    public static int largestAltitude(int[] gain){
        int currentAltitude=0;
        int largestAltitude=0;

        for(int i=0; i<=gain.length;i++){
            currentAltitude=currentAltitude+gain[i];
            if(currentAltitude>largestAltitude){
                largestAltitude= currentAltitude;
            }
        }
        return largestAltitude;
    }
}

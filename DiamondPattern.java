public class DiamondPattern {
    public static void main(String[] args) {
        patterndiamond(5);
    }
    static void patterndiamond(int n){
        for(int row=0; row<2*n; row++){
           int totalColsInRow =row>n?2 *n -row:row; 
           int noOfSpaces=n-totalColsInRow;
           for(int s=0;s<noOfSpaces;s++){
                System.out.println(" ");
           }
           for(int col=0;col<totalColsInRow; col++){
                System.out.println("* ");
           }
           System.out.println();
        }
    }
}

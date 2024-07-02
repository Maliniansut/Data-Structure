public class Pttern {
    public static void main(String[] args) {
        pattern1(4);
    }

    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            //for every row,run the col
            for(int j =1;j<=i;j++){
                System.out.println("* ");
            }
            //when one row is orinted ,we need to add a newline
            System.out.println();
        }
    }
}

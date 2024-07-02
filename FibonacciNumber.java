public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    static int fibo(int n){
        //base condition fibo(0)=0, fibo(1)=1
        if(n<2){
            return n;
        }
        //tail recursion
        return fibo(n-1)+fibo(n-2);
    }
}

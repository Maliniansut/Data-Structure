public class NumbersExample{
    public static void main(String[] args) {
        //Write a function that takes in a number and prints it
        //print first 5 number:1,2,3,4,5
        //we only need to call function once and print all these numbers
        print(1);

    }
    /*static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);//it would get back here again after its execution.
    }
        //func body changes
    static void print5(int n){//function is finished executing so it would called from where it is restored.
        System.out.println(n);
    }*/

    //if we do it with recursion then.
    static void print(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        //this is tail recursion as this is the last function call.
        print(n+1);
    }

}
package sortedOne;


public class Test {
    private static int test = 8912;
    private static int x = 3;
    private static int n = 4;

    public static void main(String[]args){
        case1(test);
        case2(test);
        case3(x,n);
        case4(43);

    }

    //returned  number of digits//
    private static void case1(int n){
        System.out.println("case1: "+Proc.numberOfDigits(n));
    }

    //return reverse view of number
    private static void case2(int n){
        System.out.println("case2: "+Proc.reverseDigits(n));
    }

    //exp(x,y)
    private static void case3(int x, int n){
        System.out.println("case3: "+Proc.exp(x,n));
    }

    //return Fibonacci number
    private static void case4(int n){
        System.out.println("case4:* "+Proc.lastFibonacciNoRecursive(n));
        System.out.println("case4: "+Proc.lastFibonacci(n));
    }
}

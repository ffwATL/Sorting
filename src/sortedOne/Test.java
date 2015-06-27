package sortedOne;


public class Test {
    private static int test = 8912;
    private static int x = 2;
    private static int n = 3;

    public static void main(String[]args){
        case1(test);
        case2(test);
        case3(x,n);

    }

    //returned  number of digits//
    private static void case1(int n){
        System.out.println(Proc.numberOfDigits(n));
    }

    //return reverse view of number
    private static void case2(int n){
        System.out.println(Proc.reverseDigits(n));
    }

    private static void case3(int x, int n){
        System.out.println(Proc.exp(x,n));
    }
}

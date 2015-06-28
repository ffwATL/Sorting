package sortedOne;


public class Proc {

    private static int c;

    public static int numberOfDigits(int n){
        if(n < 0) n*=-1;
        int count = 1;
        int constraint = 10;
        for(int i = 0; i <= n; i++){
            if(i == constraint && count++ > 0) constraint *= 10;
        }
        return count;
    }

    public static int reverseDigits(int n){
        int result = 0;
        do{
            result = result*10 + n % 10;
        } while((n /= 10) != 0);
        return result;
    }

    public static int exp(int x, int n){
        while (n > 1){
            x = x*exp(x, --n);
            return x;
        }
        return x;
    }

    public static int lastFibonacci(int n){
        if(n <= 0) return 0;
        else if(n == 1) return 1;
        else  return lastFibonacci(n-1)+lastFibonacci(n-2);
    }

    public static long lastFibonacciNoRecursive(int n){
        if(n <= 0) return 0L;
        else if(n == 1) return 1L;
        else {
            long value0 = 0L;
            long value1 = 1L;
            long value2 = 0L;
            for(int i = 0; i < n-1; i++){
                value2 = value0 + value1;
                value0 = value1;
                value1 = value2;
            }
            return value2;
        }
    }
}
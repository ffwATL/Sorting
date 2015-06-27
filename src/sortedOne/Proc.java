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
        c = n;
        while (c > 1){
            x = x*exp(x, --c);
        }
        return x;
    }





}
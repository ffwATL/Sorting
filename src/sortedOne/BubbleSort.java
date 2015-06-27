package sortedOne;


import java.util.Arrays;

public class BubbleSort {


    public static void bubbleSort(int[] ar){
        int k = ar.length - 1;
        for(int i = 0; i < k; i++){
            if(ar[i] > ar[i+1]){
                swap(ar, i, false);
            }
            if(i == (k-1) && k-- > 0) i = -1;
        }
    }

    private static void swap(int[] ar, int i,boolean invert) {
        if(!invert){
            int tmp = ar[i];
            ar[i] = ar[i+1];
            ar[i+1] = tmp;
        }else {
            int tmp = ar[i];
            ar[i] = ar[i-1];
            ar[i-1] = tmp;
        }
    }

    public static void bubbleSortInvert(int[] ar){
        int k = 0;
        for(int i = ar.length-1; i > k; i--)  {
            if(ar[i] < ar[i-1]){
                swap(ar, i, true);
            }
            if(i == (k+1) && k++ < ar.length-1) i = ar.length;
        }
    }
}

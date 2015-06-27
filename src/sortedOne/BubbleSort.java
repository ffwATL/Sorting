package sortedOne;


import java.util.Arrays;

public class BubbleSort {

    public static void main(String[]args){
        int[] arr = {0,-1,20,330,4,50,6,7,8,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void bubbleSort(int[] ar){
        int k = ar.length-1;
        for(int i = 0; i < k;i++){
            if(ar[i] > ar[i+1]){
            int tmp = ar[i];
            ar[i] = ar[i+1];
            ar[i+1] = tmp;
            }
            if(i == (k-1) && k-- > 0) i = 0;

        }
    }
}

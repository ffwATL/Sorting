package sortedOne;


import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[]a, int[]b){
        int[]result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        while (aIndex + bIndex < result.length){
            if(aIndex == a.length) {
                fillRest(result, b, (aIndex+bIndex), bIndex);
                break;
            } else if(bIndex == b.length) {
                fillRest(result, a,(aIndex+bIndex), aIndex);
                break;
            }
            if(a[aIndex] < b[bIndex])  result[aIndex + bIndex] = a[aIndex++];
            else  result[bIndex + aIndex] = b[bIndex++];
        }
        return result;
    }

    private static void fillRest(int[] res, int[] f, int resIndex, int fIndex){
        for(int i = resIndex; i <res.length; i++){
            res[i]=f[fIndex++];
        }
   }


}

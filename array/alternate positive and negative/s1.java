import java.util.Arrays;

class Solution {
    void rearrange(int arr[], int n) {
        int negativeArr[] = new int[n];
        int positiveArr[] = new int[n];
        int positiveIndex = 0, negativeIndex = 0, i = 0, j = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positiveArr[positiveIndex++] = arr[i];
            } else {
                negativeArr[negativeIndex++] = arr[i];
            }
        }
        
        i = 0; j = 0;
        int k = 0;
        while (i < positiveIndex && j < negativeIndex) {
            if (k % 2 == 0) {
                arr[k++] = positiveArr[i++];
            } else {
                arr[k++] = negativeArr[j++];
            }
        }
        
        while (i < positiveIndex) {
            arr[k++] = positiveArr[i++];
        }
        
        while (j < negativeIndex) {
            arr[k++] = negativeArr[j++];
        }
    }
}

public class s1 {
    public static void main(String[] args) {
        int[] arr1 = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int[] arr2 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        Solution s = new Solution();
        s.rearrange(arr1, arr1.length);
        s.rearrange(arr2, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
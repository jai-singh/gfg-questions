class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long min = 1, max = 1, res = Integer.MIN_VALUE, temp;
        for (int i = 0; i < n; i++) {
            res = Math.max(arr[i], res);
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                min = 1;
                max = 1;
                continue;
            }
            temp = max * arr[i];
            max = Math.max(arr[i], Math.max(max * arr[i], min * arr[i]));
            min = Math.min(arr[i], Math.min(temp, min * arr[i]));
            res = Math.max(res, max);
        }
        return res;
    }
}

public class s1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr1[] = {6, -3, -10, 0, 2};
        int arr2[] = {2, 3, 4, 5, -1, 0};
        System.out.println(s.maxProduct(arr1, 5));
        System.out.println(s.maxProduct(arr2, 6));
    }
}
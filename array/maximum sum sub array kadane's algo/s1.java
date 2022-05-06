class Solution{
    long maxSubarraySum(int arr[], int n){
        long maxSum = Integer.MIN_VALUE;
        long currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum = currentSum + arr[i];
            maxSum = Math.max(currentSum, maxSum);
            currentSum = Math.max(currentSum, 0);
        }
        return maxSum;
    }    
}

public class s1 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, -2, 5};
        Solution sol = new Solution();
        System.out.println(sol.maxSubarraySum(arr1, arr1.length));
        int arr2[] = {-1,-2,-3,-4};
        System.out.println(sol.maxSubarraySum(arr2, arr2.length));
    }
}
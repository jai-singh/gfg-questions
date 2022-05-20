class Solution {
    static int max_sum(int arr[], int n) {
	   int maxSum = Integer.MIN_VALUE;
	   int currSum = 0, cummalativeSum = 0;
	   for (int i = 0; i < n; i++) {
	       currSum += arr[i] * i;
	       cummalativeSum += arr[i];
	   }
	   maxSum = Math.max(maxSum, currSum);
	   for (int i = 0; i < n - 1; i++) {
	       currSum = currSum + cummalativeSum - arr[n - i - 1] * n;
	       maxSum = Math.max(maxSum, currSum);
	   }
	   return maxSum;
    }	
}

public class s2 {
	public static void main(String[] args) {
		int[] arr1 = {8, 3, 1, 2};
		System.out.println(Solution.max_sum(arr1, 4));
	}
}
//naive solution won't pass all test case because of TLE

class Solution {
    static int max_sum(int arr[], int n) {
	   int maxSum = Integer.MIN_VALUE;
	   for (int i = 0; i < n; i++) {
	       int currSum = 0;
	       for (int j = 0; j < n; j++) {
	           currSum += arr[j] * ((i + j) % n);
	       }
	       maxSum = Math.max(maxSum, currSum);
	   }
	   return maxSum;
	}
}

public class s1 {
	public static void main(String[] args) {
		int[] arr1 = {8, 3, 1, 2};
		System.out.println(Solution.max_sum(arr1, 4));
	}
}
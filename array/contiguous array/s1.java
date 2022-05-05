import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] arr) {
        HashMap<Integer, Integer> sumFirstOccurence = new HashMap<>();
        int currentSum = 0, temp;
        sumFirstOccurence.put(0, -1);
        int longest = 0;
        int beginIndex;
        for (int i = 0; i < arr.length; i++) {
            temp = (arr[i] == 0) ? -1 : 1;
            currentSum += temp;
            if (sumFirstOccurence.containsKey(currentSum)) {
                beginIndex = sumFirstOccurence.get(currentSum);
                longest = Math.max(longest, i - beginIndex);
            } else {
                sumFirstOccurence.put(currentSum, i);
            }
        }
        return longest;
    }
}

public class s1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 1, 0, 1, 1};
        int[] arr2 = {1, 0};
        Solution s = new Solution();
        System.out.println(s.findMaxLength(arr1));
        System.out.println(s.findMaxLength(arr2));
    }
}
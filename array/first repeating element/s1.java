//Solution using HashMap

import java.util.HashMap;

class Solution {
        public static int firstRepeated(int[] arr, int n) {
                HashMap<Integer, Integer> elementsIndex = new HashMap<>();
                int smallerIndex = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    if (elementsIndex.containsKey(arr[i])) {
                        if (smallerIndex > elementsIndex.get(arr[i])) {
                            smallerIndex = elementsIndex.get(arr[i]);
                        }
                    }
                    elementsIndex.put(arr[i], i + 1);
                }
                return (smallerIndex == Integer.MAX_VALUE) ? -1 : smallerIndex;
        }
}

public class s1 {
        public static void main(String[] args) {
                int[] arr1 = {1, 5, 3, 4, 3, 5, 6};
                System.out.println(Solution.firstRepeated(arr1, arr1.length));
                int[] arr2 = {1, 2, 3, 4};
                System.out.println(Solution.firstRepeated(arr2, arr2.length));
        }
}
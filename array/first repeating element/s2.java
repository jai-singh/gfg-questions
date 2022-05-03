//Solution without using any data structure

class Solution {
        public static int firstRepeated(int[] arr, int n) {
                int i, flag = 0, max = n;
                for (i = 0; i < n; i++) {
                    max = Math.max(max, arr[i]);
                }
                
                int[] firstOccurence = new int[max + 1];
                
                int minIndex = Integer.MAX_VALUE;
                
                for (i = 0; i < n; i++) {
                    if (firstOccurence[arr[i]] != 0 && minIndex > firstOccurence[arr[i]]) {
                        minIndex = firstOccurence[arr[i]];
                        flag = 1;
                    } else {
                        firstOccurence[arr[i]] = i + 1;
                    }
                }
                if (flag == 0) {
                    return -1;
                } 
                return minIndex;
        }
}

public class s2 {
        public static void main(String[] args) {
                int[] arr1 = {1, 5, 3, 4, 3, 5, 6};
                System.out.println(Solution.firstRepeated(arr1, arr1.length));
                int[] arr2 = {1, 2, 3, 4};
                System.out.println(Solution.firstRepeated(arr2, arr2.length));
        }
}
import java.util.*;

class Solution
{
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        HashMap<Integer, Integer> countSum = new HashMap<>();
        int totalSubArr = 0;
        int sum = 0, temp;
        countSum.put(0, 1);
        for (int i = 0; i < n; i++) {
            temp = (arr[i] == 0) ? -1 : 1;
            sum = sum + temp;
            if (countSum.containsKey(sum)) {
                totalSubArr += countSum.get(sum);
                countSum.put(sum, countSum.get(sum) + 1);
            } else {
                countSum.put(sum, 1);
            }
        }
        return totalSubArr;
    }
}

public class s1 {
    public static void main(String[] args) {
        int[] arr1 = {1,0,0,1,0,1,1};
        System.out.println(Solution.countSubarrWithEqualZeroAndOne(arr1, arr1.length));
        int[] arr2 = {1,1,1,1,0};
        System.out.println(Solution.countSubarrWithEqualZeroAndOne(arr2, arr2.length));
    }
}
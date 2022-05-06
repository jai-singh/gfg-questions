import java.util.HashSet;

class Solution{
    static boolean findsum(int arr[],int n)
    {
        HashSet<Integer> subArraySum = new HashSet<>();
        subArraySum.add(0);
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (subArraySum.contains(currentSum)) {
                return true;
            } 
            subArraySum.add(currentSum);
        }
        return false;
    }
}

public class s1 {
    public static void main(String[] args) {
        int arr1[] = {4, 2, -3, 1, 6};
        System.out.println(Solution.findsum(arr1, arr1.length));
        int arr2[] = {4, 2, 3, 1, 6};
        System.out.println(Solution.findsum(arr2, arr2.length));
    }
}
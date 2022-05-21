import java.util.Arrays;

class Solution {
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0;
        int platforms = 1;
        int minOccupied = 1;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
            } else if (arr[i] > dep[j]){
                platforms--;
                j++;
            } 
            minOccupied = Math.max(minOccupied, platforms);
        }
        return minOccupied;
    }
}

public class s1 {
    public static void main (String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(Solution.findPlatform(arr, dep, 6));
    }
}
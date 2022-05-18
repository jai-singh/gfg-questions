class Solution
{
    static int findMin(int arr[], int n)
    {
        int low = 0, high = n - 1, mid;
        int ans = arr[0];
        while (low <= high) {
            if (arr[low] < arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            } 
            mid = low + (high - low) / 2;
            ans = Math.min(ans, arr[mid]);
            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        return ans;
    }
}

public class s1 {
    public static void main(String[] args) {
        int arr1[] = {4, 5, 1 ,2 ,3};
        System.out.println(Solution.findMin(arr1, 5));
        int arr2[] = {10, 20, 30, 40, 50, 5, 7};
        System.out.println(Solution.findMin(arr2, 7));
           
    }
}
import java.util.Arrays;

class Solution{
    String longestCommonPrefix(String arr[], int n){
        StringBuffer lcp = new StringBuffer("");
        Arrays.sort(arr);
        for (int i = 0; i < arr[0].length(); i++) {
            if (arr[0].charAt(i) == arr[n - 1].charAt(i)) {
                lcp.append(arr[0].charAt(i));
            } else {
                break;
            }
        }
        return (lcp.length() == 0) ? "-1" : String.valueOf(lcp); 
    }
}

public class s2 {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        Solution s1 = new Solution();
        System.out.println(s1.longestCommonPrefix(arr, arr.length));
    }
}
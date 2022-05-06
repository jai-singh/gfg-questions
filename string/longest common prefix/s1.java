class Solution{
    String longestCommonPrefix(String arr[], int n){
        StringBuffer lcp = new StringBuffer("");
        if (n == 1) {
            return arr[0];
        }
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (minLen > arr[i].length()) {
                minLen = arr[i].length();
            }
        }
        
        boolean matching = false;
        for (int i = 0; i < minLen; i++) {
                char matchChar = arr[0].charAt(i);
                matching = true;
                for (int j = 1; j < n; j++) {
                    if (!(matchChar == arr[j].charAt(i))) {
                        matching = false;
                    }
                    
                    if (!matching) {
                        break;
                    }
                    
                }
                if (matching) {
                    lcp.append(matchChar);
                } else {
                    break;
                }
        }
        
        return (lcp.length() != 0) ? String.valueOf(lcp) : "-1";
    }
}

public class s1 {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        Solution s1 = new Solution();
        System.out.println(s1.longestCommonPrefix(arr, arr.length));
    }
}
import java.util.Arrays;

class Solution {
    static int t[][];
    
    static int minimumNumberOfDeletions(String S) {
        StringBuffer str = new StringBuffer(S);
        t = new int[1001][1001];
        for (int[] row: t) {
            Arrays.fill(row, -1);
        }
        int l = S.length();
        int lps = longestSubSequence(S, String.valueOf(str.reverse()), l, l);
        return S.length() - lps;
    }
    
    static int longestSubSequence(String s1, String s2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        
        if (t[n][m] != -1) {
            return t[n][m];
        }
        
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            t[n][m] =  1 + longestSubSequence(s1, s2, n - 1, m - 1);
        } else {
            t[n][m] = Math.max(longestSubSequence(s1, s2, n, m - 1), longestSubSequence(s1, s2, n - 1, m));
        }
        return t[n][m];
    }
}

public class s1 {
    public static void main(String[] args) {
        System.out.println(Solution.minimumNumberOfDeletions("aebcbda"));
        System.out.println(Solution.minimumNumberOfDeletions("geeksforgeeks"));
    }
}
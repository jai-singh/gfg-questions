class Solution {

    static int minimumNumberOfDeletions(String S) {
        StringBuffer str = new StringBuffer(S);
        int l = S.length();
        int lps = longestSubSequence(S, String.valueOf(str.reverse()), l, l);
        return S.length() - lps;
    }
    
    static int longestSubSequence(String s1, String s2, int n, int m) {
        int[][] t = new int[n + 1][m + 1];
        
        for (int i = 0; i <= n; i++) {
            t[i][0] = 0; 
        }
        
        for (int i = 0; i <= m; i++) {
            t[0][i] = 0; 
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }
            }
        }
        
        return t[n][m];
    }
}

public class s2 {
    public static void main(String[] args) {
        System.out.println(Solution.minimumNumberOfDeletions("aebcbda"));
        System.out.println(Solution.minimumNumberOfDeletions("geeksforgeeks"));
    }
}
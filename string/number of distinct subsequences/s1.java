import java.util.HashMap;

class Solution {
    int distinctSubsequences(String S) {
        HashMap<Character, Integer> charPreviousIndex = new HashMap<>();
        int[] dp = new int[S.length() + 1];
        dp[0] = 1;
        int mod = (int) Math.pow(10, 9) + 7;
        for (int i = 1; i < dp.length; i++) {
            char ch = S.charAt(i - 1);
            dp[i] = (dp[i - 1] * 2) % mod;
            if (charPreviousIndex.containsKey(ch)) {
                int  j = charPreviousIndex.get(ch);
                dp[i] = (dp[i] - dp[j - 1]) % mod;
            }
            if (dp[i] < 0) {
                dp[i] += mod;
            }
            charPreviousIndex.put(ch, i);
        }
        return (int) dp[S.length()];
    }
}

public class s1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.distinctSubsequences("gfg"));
        System.out.println(s.distinctSubsequences("ggg"));   
    }
}
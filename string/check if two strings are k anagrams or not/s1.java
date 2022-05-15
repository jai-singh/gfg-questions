import java.util.Arrays;

class Solution {
    boolean areKAnagrams(String str1, String str2, int k) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int[] map = new int[128];
        
        Arrays.fill(map, 0);
        
        for (int i = 0; i < str1.length(); i++) {
            map[str1.charAt(i)]++;
        }
        
        for (int i = 0; i < str2.length(); i++) {
            if (map[str2.charAt(i)] > 0) {
                map[str2.charAt(i)]--;
            } else {
                k--;
            }
            if (k < 0) {
                return false;
            }
        }
        return true;
    }
}

public class s1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.areKAnagrams("fodr", "gokr", 2));
        System.out.println(s.areKAnagrams("fodr", "gfkr", 1));
    }
}
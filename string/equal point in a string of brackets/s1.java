class Solution {
    public long countSub(String str) {
        long closingCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                closingCount++;
            }
        }
        int openingCount = 0, i;
        for (i = 0; i < str.length(); i++) {
            if (openingCount == closingCount) {
                return i;
            }
            if (str.charAt(i) == '(') {
                openingCount++;
            } else {
                closingCount--;
            }
        }
        return i;
    }
}

public class s1 {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.countSub("(())))("));
        System.out.println(s1.countSub("))"));        
    }
}
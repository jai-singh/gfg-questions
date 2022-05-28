class Solution {
    String findSum(String X, String Y) {
        if (X.length() < Y.length()) {
            return findSum(Y, X);
        
        }
        
        StringBuilder result = new StringBuilder("");
        int l1 = Y.length(), l2 = X.length();
        int carry = 0, sum, i;
        for (i = 0; i < Y.length(); i++) {
            sum = X.charAt(l2 - i - 1)  - '0' + Y.charAt(l1 - i - 1) - '0' + carry;
            carry = sum / 10;
            sum = sum % 10;
            result.insert(0, String.valueOf(sum));
        }
        
        while (carry > 0 && X.length() > i) {
            sum = X.charAt(l2 - i - 1) - '0' + carry;
            carry = sum / 10;
            sum = sum % 10;
            result.insert(0, String.valueOf(sum));
            i++;
        }
        
        
        while (carry > 0) {
            sum = carry % 10;
            carry = carry / 10;
            result.insert(0, String.valueOf(sum));
        }
        
        while (X.length() > i) {
            sum = X.charAt(l2 - i - 1) - '0';
            result.insert(0, String.valueOf(sum));
            i++;
        }
        
        i = 0;
        
        while (result.charAt(i) == '0' && result.length() != 1) {
            result.deleteCharAt(0);
        }
        
        return String.valueOf(result);
    }
}

public class s1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findSum("25", "23"));
        System.out.println(s.findSum("2500", "23"));   
    }
}
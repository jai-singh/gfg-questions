class Solution {
    String addBinary(String A, String B) {
        StringBuilder result = new StringBuilder("");
        int carry = 0, sum = 0;
        int l1 = A.length() - 1;
        int l2 = B.length() - 1;
        while (l1 >= 0 || l2 >= 0) {
            sum = carry;
            if (l1 >= 0) {
                sum += A.charAt(l1) - '0';
                l1--;
            }
            
            if (l2 >= 0) {
                sum += B.charAt(l2) - '0';
                l2--;
            }
                
            result.append(String.valueOf(sum % 2));
            carry = sum / 2;
        }
        
        if (carry != 0) {
            result.append(1);
        }
        
        result = result.reverse();
        
        while (result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        
        return String.valueOf(result);
    }
}

public class s1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.addBinary("1101", "111"));
        System.out.println(s.addBinary("10", "01"));   
    }
}
class Solution {
    public boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                count++;
            }
        }
        
        if (count > 3) {
            return false;
        } 
        
        String[] arrStr = s.split("\\."); 
        
        if (arrStr.length < 4 || arrStr.length > 4) {
            return false;
        }
        
        int[] address = new int[4];
        
        for (int i = 0; i < 4; i++) {
            address[i] = 0;
            
            int k = arrStr[i].length();
            
            if (k == 0 || k > 3) {
                return false;
            }
            
            int j = 0; 
            
            if (arrStr[i].charAt(0) == '0' && arrStr[i].length() >= 2) {
                return false;
            }
            
            while (j < k) {
                if (arrStr[i].charAt(j) >= '0' && arrStr[i].charAt(j) <= '9') {
                    address[i] = address[i] * 10 + arrStr[i].charAt(j) - '0';
                } else {
                    return false;
                }
                j++;
            }
            
            if (address[i] > 255) {
                return false;
            }
        }
        return true;
    }
}

public class s1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isValid("222.111.111.111"));
        System.out.println(s.isValid("5555..555"));  
    }
}
class Solution {
    static String encryptString(String S){
        StringBuffer output = new StringBuffer("");
        int count = 1;
        char previous = S.charAt(S.length() - 1);
        for (int i = S.length() - 2; i >= 0; i--) {
            if (previous == S.charAt(i)) {
                count++;
            } else {
                output.append(Integer.toHexString(count));
                output.append(previous);
                previous = S.charAt(i);
                count = 1;
            }
        }
        output.append(Integer.toHexString(count));
        output.append(previous);
        return String.valueOf(output);
    }
}

public class s1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.encryptString("aaaaaaaaaaa"));
        System.out.println(s.encryptString("abc"));  
    }
}
import java.util.Arrays;

class Solution
{
    public static boolean checkPangram (String str) {
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, 0);
        str = str.toLowerCase();
        int value;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                value = str.charAt(i) - 'a';
                alphabet[value] = 1;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] != 1) {
                return false;
            }
        }
        return true;
    }
}

public class s1 {
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.checkPangram("Bawds jog, flick quartz, vex nymph"));
        System.out.println(s.checkPangram("Hello Beautiful"));   
    }
}
class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        StringBuffer num1 = new StringBuffer(s1);
        StringBuffer num2 = new StringBuffer(s2);
        int start1 = 0;
        int start2 = 0;
        boolean negative = false;
        if (checkAllZero(s1) || checkAllZero(s2)) {
            return "0";
        }
        if (num1.charAt(0) == '-' && num2.charAt(0) == '-') {
            start1 = 1;
            start2 = 1;
        } else if (num1.charAt(0) == '-') {
            start1 = 1;
            negative = true;
        } else if (num2.charAt(0) == '-') {
            start2 = 1;
            negative = true;
        }
        num1 = num1.reverse();
        num2 = num2.reverse();
        
        int[] result = new int[num1.length() + num2.length()];
        int pro;
        for (int i = 0; i < num1.length() - start1; i++) {
            for (int j = 0; j < num2.length() - start2; j++) {
                pro = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                // System.out.println(num1.charAt(i) + " " + num2.charAt(j));
                result[i + j] = result[i + j] +  pro;
                result[i + j + 1] = result[i + j + 1] + result[i + j] / 10;
                result[i + j] = result[i + j] % 10;
            }
        }
        int i = result.length - 1;
        StringBuffer r = new StringBuffer("");
        while (result[i] == 0) {
            i--;
        }
        // System.out.println(i);
        for (int j = i; j >= 0; j--) {
            r.append(Integer.toString(result[j]));
        }
        if (negative) {
            r.insert(0, "-");
        }
        return String.valueOf(r);
    }
    
    public boolean checkAllZero(String s) {
        int i = 0;
        if (s.charAt(i) != '0') {
            return false;
        }
        while (s.charAt(i) == '0' && i < s.length() - 1) {
            if (s.charAt(i + 1) != '0') {
                return false;
            }
            i++;
        }
        return true;
    }
}

public class s1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.multiplyStrings("50", "20"));
        System.out.println(s.multiplyStrings("50", "-20"));
    }
}
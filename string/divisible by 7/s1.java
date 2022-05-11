class Solution {
    int isdivisible7(String num) {
        long numSum = 0;
        int k = 0;
        for (int i = num.length(); i > 0; i = i - 3) {
            if (i - 3 > 0) {
                int p = (int) Math.pow(-1, k) * Integer.valueOf(num.substring(i - 3, i));
                numSum = numSum + p;
            } else {
                int p = (int) Math.pow(-1, k) * Integer.valueOf(num.substring(0, i));
                numSum = numSum + (int) Math.pow(-1, k) * Integer.valueOf(num.substring(0, i));
            }
            k++;
        }
        return numSum % 7 == 0 ? 1 : 0;
    }
}

public class s1 {
    public static void main(String[] args) {
        Solution ss = new Solution();
        System.out.println(ss.isdivisible7("8955795758"));
        System.out.println(ss.isdivisible7("10000"));   
    }
}
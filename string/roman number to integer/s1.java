import java.util.HashMap;

class Solution {
    public int romanToDecimal(String str) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int number = 0;
        number = roman.get(str.charAt(0));
        int previousValue = roman.get(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (roman.get(str.charAt(i)) > previousValue) {
                number = number - 2 * previousValue;
            } 
            number = number + roman.get(str.charAt(i));
            previousValue = roman.get(str.charAt(i));
        }
        return number;
    }
}

class s1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToDecimal("IV"));
        System.out.println(s.romanToDecimal("XIV"));   
    }
}
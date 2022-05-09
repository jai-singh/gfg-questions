class Solution
{
	String convertToRoman(int n) {
		String[] units = {"", "I" , "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		
		String[] tens = {"" , "X" , "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		
		String[] hundreds = {"", "C" , "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		
		String[] thousands = {"", "M" , "MM", "MMM" };
		
		return thousands[n / 1000] + hundreds[(n % 1000) / 100] + tens[(n % 100) / 10] + units[n % 10];
	}
}

public class s1 {
	public static void main(String[] args) {
		Solution s1 = new Solution();
		System.out.println(s1.convertToRoman(3514));
	}
}
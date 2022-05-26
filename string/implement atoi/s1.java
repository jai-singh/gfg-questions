class Solution
{
    int atoi(String str) {
	    int num = 0, startIndex = 0, fact = 1;
	    if (str.charAt(0) == '-') {
	        startIndex = 1;
	        fact = -1;
	    }
	    for (int i = startIndex; i < str.length(); i++) {
	        if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
	            num = num * 10 + str.charAt(i) - '0';
	        } else {
	            return -1;
	        }
	    }
	    
	    return num * fact;
    }
}

public class s1 {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.atoi("123"));
		System.out.println(s.atoi("-123"));	
	}
}
import java.util.HashMap;

class Solution
{
    public static boolean areIsomorphic(String str1,String str2)
    {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for (int i = 0; i < str1.length(); i++) {
            if ((map1.containsKey(str1.charAt(i)) && map1.get(str1.charAt(i)) != str2.charAt(i)) 
            || (map2.containsKey(str2.charAt(i)) && map2.get(str2.charAt(i)) != str1.charAt(i))) {
                return false;
            } else if (!map1.containsKey(str1.charAt(i))) {
                map1.put(str1.charAt(i), str2.charAt(i));
                map2.put(str2.charAt(i), str1.charAt(i));
            }
        }
        return true;
        
    }
}

public class s1 {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.areIsomorphic("aab", "xxy"));
		System.out.println(s.areIsomorphic("aab", "xyz"));
	}
}
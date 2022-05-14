import java.util.Arrays;

class Solution
{
    public static boolean areIsomorphic(String str1,String str2)
    {
      if (str1.length() != str2.length()) {
            return false;
        }
        
        boolean marked[] = new boolean[256];
        int map[] = new int[256];
        Arrays.fill(map, -1);
        Arrays.fill(marked, false);
        for (int i = 0; i < str1.length(); i++) {
            if (map[str1.charAt(i)] == -1) {
                if (marked[str2.charAt(i)] == true)
                    return false;
                
                marked[str2.charAt(i)] = true;
                
                map[str1.charAt(i)] = str2.charAt(i);
            } else if (map[str1.charAt(i)] != str2.charAt(i)) {
                return false;
            }    
        }
        
        return true;
    }
}
public class s2 {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.areIsomorphic("aab", "xxy"));
		System.out.println(s.areIsomorphic("aab", "xyz"));
	}
}
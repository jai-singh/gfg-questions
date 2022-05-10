import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        if (word1.equals(word2)) {
            return 0;
        }
        for (int i = 0; i < s.size(); i++) {
            if (word1.equals(s.get(i))) {
                start = i;
            } else if (word2.equals(s.get(i))) {
                end = i;
            }
            if (end != start)
                min = Math.min(min, Math.abs(end - start));
        }
        return min;
    }
}

public class s1 {
    public static void main(String[] args) {
        String[] arrStr1 = { "the", "quick", "brown", "fox", "quick"};
        String[] arrStr2 = {"geeks", "for", "geeks", "contribute", "practice"};
        Solution s = new Solution();
        System.out.println(s.shortestDistance(new ArrayList<>(Arrays.asList(arrStr1)), "the", "fox"));
        System.out.println(s.shortestDistance(new ArrayList<>(Arrays.asList(arrStr2)), "geeks", "practice"));   
    }
}
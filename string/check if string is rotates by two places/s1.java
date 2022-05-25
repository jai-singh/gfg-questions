class Solution {
    public static boolean isRotated(String str1, String str2) {
        if (str1.length() < 2 || str2.length() < 2) {
            if (str1.equals(str2)) {
                return true;
            } else {
                return false;
            }
        }
        
        String temp1 = str1.substring(2, str1.length()) + str1.substring(0, 2);
        String temp2 = str1.substring(str1.length() - 2, str1.length()) + str1.substring(0, str1.length() - 2);
        
        if (temp1.equals(str2) || temp2.equals(str2)) {
            return true;
        }
        return false;
    }
}

public class s1 {
    public static void main(String[] args) {
        System.out.println(Solution.isRotated("amazon", "azonam"));
        System.out.println(Solution.isRotated("geeksforgeeks", "geeksgeeksfor"));   
    }
}
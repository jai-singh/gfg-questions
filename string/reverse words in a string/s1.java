class Solution 
{
    String reverseWords(String S)
    {
        String[] arrString = S.split("\\.");
        StringBuffer outputString = new StringBuffer("");
        for (int i = arrString.length - 1; i >= 0; i--) {
            outputString.append(arrString[i]);
            outputString.append(".");
        }
        outputString.deleteCharAt(outputString.length() - 1);
        return String.valueOf(outputString);
    }
}

class s1 {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        Solution ss = new Solution();
        System.out.println(ss.reverseWords(s));
    }
}
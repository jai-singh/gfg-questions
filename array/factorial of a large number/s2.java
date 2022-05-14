import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> factorial = new ArrayList<>();
        factorial.add(1);
        int temp;
        for (int i = 2; i <= N; i++) {
            multiply(factorial, i);
        }
        
        int size = factorial.size();
        
        for (int i = 0; i < size / 2; i++) {
            temp = factorial.get(i);
            factorial.set(i, factorial.get(size - i - 1));
            factorial.set(size - i - 1, temp);
        }
        
        return factorial;
    }
    
    static void multiply(ArrayList<Integer> factorial, int x) {
        int size = factorial.size();
        int carry = 0;
        for (int i = 0; i < size; i++) {
            carry = factorial.get(i) * x + carry;
            factorial.set(i, carry % 10);
            carry = carry / 10;
        }
        
        while (carry > 0) {
            factorial.add(carry % 10);
            carry = carry / 10;
        }
    }
}

public class s2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.factorial(5));
        System.out.println(s.factorial(20));    
    }
}
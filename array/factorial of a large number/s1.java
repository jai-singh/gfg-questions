class Solution {
    static class Node {
        int data;
        Node prev;
    }
    
    static ArrayList<Integer> factorial(int N){
        Node number = new Node();
        number.data = 1;
        number.prev = null;
        int prod, carry = 0, rem;
        for (int i = 2; i <= N; i++) {
            Node currentNode = number;
            Node prevNode = null;
            while (currentNode != null) {
                  prod = currentNode.data * i + carry;
                  rem = prod % 10;
                  carry = prod / 10;
                  currentNode.data = rem;
                  prevNode = currentNode;
                  currentNode = currentNode.prev;
            }
            
            while (carry != 0) {
                rem = carry % 10;
                prevNode.prev = new Node();
                prevNode = prevNode.prev;
                prevNode.data = rem;
                carry = carry / 10;
            }
        }
        
        Node currentNode = number;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while (currentNode != null) {
            result.add(currentNode.data);
            currentNode = currentNode.prev;
        }
        
        Collections.reverse(result);
        
        return result;
    }
}


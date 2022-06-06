//code won't compile on your local machine but will work fine on GFG
class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Node fast = head;
        Node slow = head;
        
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if (slow != null) {
            Node h = slow.next;
            Node dummy = null;
            Node next;
            while (h != null) {
                next = h.next;
                h.next = dummy;
                dummy = h;
                h = next;
            }
            slow.next = dummy;
        }
        
        slow = slow.next;
        
        Node currentNode = head;
        
        while (slow != null) {
            if (currentNode.data != slow.data) {
                return false;
            }
            slow = slow.next;
            currentNode = currentNode.next;
        }
        
        return true;
    }    
}

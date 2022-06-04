//code won't but will compile in your local machine but work fine in gfg
class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        Node slow = head;
        Node fast = head;
        // boolean flag = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                // flag = true;
                break;
            }
        }
        
        if (slow == fast) {
            fast = head;
            if (fast != slow) {
                while (fast.next != slow.next) {
                    fast = fast.next;
                    slow = slow.next;
                }
                
                slow.next = null;
            } else {
                while (slow.next != fast) {
                    slow = slow.next;
                }
                slow.next = null;
            }
        }
        
        
    }
}
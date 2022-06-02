class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        Node fastNode = head;
        Node slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (slowNode == fastNode) {
                return true;
            }
        }
        return false;
    }
}
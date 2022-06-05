//code won't compile on your local machine but will work fine on GFG
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node dummy = null;
        Node currentNode;
        while (head != null) {
            currentNode = head;
            head = head.next;
            currentNode.next = dummy;
            dummy = currentNode;
        }
        return dummy;
    }
}
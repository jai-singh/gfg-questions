class Solution
{
    //Solution code
    Node removeDuplicates(Node head)
    {
        Node parrentNode = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.data == parrentNode.data) {
                parrentNode.next = currentNode.next;
                currentNode = parrentNode.next;
            } else {
                 parrentNode = currentNode;
                 currentNode = currentNode.next;
            }
        }
        return head;
    }
}

class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}

public class s1 {
    public static void insertElement(Node head, int ele) {
        if (head == null) {
            head = new Node(ele); 
        }

        while (true) {
            if (head.next == null) {
                head.next = new Node(ele);
                return;
            }
            head = head.next;
        }
    }

    public static void printList(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        insertElement(head, 2);
        insertElement(head, 4);
        insertElement(head, 4);
        insertElement(head, 5);
        printList(head);        
        Solution s = new Solution();
        head = s.removeDuplicates(head);
        printList(head);                
    }   
}

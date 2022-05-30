class Solution {
    //Solution code
    Node deleteMid(Node head) {
        Node fast = head;
        Node slow = head;
        Node parentSlow = null;

        while (fast != null && fast.next != null) {
            parentSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (parentSlow == null) {
            slow = null;
        } else {
            parentSlow.next = slow.next;
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
        Node head = new Node(1);
        insertElement(head, 2);
        insertElement(head, 3);
        insertElement(head, 4);
        insertElement(head, 5);
        printList(head);        
        Solution s = new Solution();
        head = s.deleteMid(head);
        printList(head);                
    }   
}
class Solution
{   
    //Solution code
    int getMiddle(Node head)
    {
        Node fastNode = head;
        Node slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return slowNode.data;
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

public class s2 {
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
        Solution s = new Solution();
        printList(head);
        System.out.println("Middle currently: " + s.getMiddle(head));
        insertElement(head, 2);
        printList(head);
        System.out.println("Middle currently: " + s.getMiddle(head));
        insertElement(head, 3);
        printList(head);
        System.out.println("Middle currently: " + s.getMiddle(head));
        insertElement(head, 4);
        printList(head);        
        System.out.println("Middle currently: " + s.getMiddle(head));
        insertElement(head, 5);
        printList(head);
        System.out.println("Middle currently: " + s.getMiddle(head));
    }
}
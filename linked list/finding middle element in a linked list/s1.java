class Solution
{
    //Solution Code
    int getMiddle(Node head)
    {
        Node currentNode = head;
        int count = 0;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            count++;
        }
        int middle = (int)Math.ceil(count / 2.0);
        int i = 0;
        currentNode = head;
        while (i < middle) {
            currentNode = currentNode.next;
            i++;
        }
        return currentNode.data;
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
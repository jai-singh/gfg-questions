class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class Solution
{
    public static Node addOne(Node head) 
    {
        int carry = addO(head);
        if (carry != 0) {
            Node newHead = new Node(carry % 10);
            newHead.next = head;
            head = newHead;
            carry = carry / 10;
        } 
        return head;
    }
    
    public static int addO(Node head) {
        int sum;
        if (head.next == null) {
            sum = head.data + 1;
        } else {
            sum = head.data + addO(head.next);
        }
        int carry = sum / 10;
        head.data = sum % 10;
        return carry;
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
        Node head = new Node(9);
        insertElement(head, 9);
        insertElement(head, 9);
        printList(head);        
        head = Solution.addOne(head);
        printList(head);                
    }   
}

package LinkedList;

public class LinkedList {
    Node head;
    void add(int val) {
        Node newNode = new Node(val);
//        if head equals to null , then make the new Node as HEAD
        if (head == null) {
            head = newNode;
        }
        else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }
    void traverse() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    void delete(int val) {
        Node current = head;
        Node pre = null;
        while (current != null && current.val != val) {
            pre = current;
            current = current.next;
        }
        if (current != null) {
            pre.next = current.next;
        }
    }
    void printMiddle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle value : " + slow.val);
    }
}

package LinkedList;

class Node {
    int data;
    Node next;
    Node(int val) {
        this.data = val;
        this.next = null;
    }
}
public class linkedlist {
    Node head;
    void insert(int val) {
       Node newnode = new Node(val);
       if(head == null) {
           head = newnode;
       }
       else {
           Node temp = head;
           while(temp.next != null) {
               temp = temp.next;
           }
           temp.next = newnode;
       }
    }
    void traverse() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    void middle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    void reverse() {
        Node temp = head;
        Node pre = null;
        while(temp != null) {
            Node next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        head = pre;
    }
    public static void main(String[] args) {
        linkedlist anode = new linkedlist();
        anode.insert(1);
        anode.insert(2);
        anode.insert(3);
        anode.insert(4);
        anode.traverse();
        anode.middle();
        anode.reverse();
        anode.traverse();



    }
}

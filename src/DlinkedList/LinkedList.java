package DlinkedList;
class Node {
    int data;
    Node next;
    Node prev;
    Node(int val) {
        this.data = val;
        this.next = null;
        this.prev = null;
    }
}
public class LinkedList {
    Node head;
    Node tail;
    public void insert(int val) {

        Node newnode = new Node(val);
        if(head == null) {
            head = newnode;
            tail = newnode;
            tail.next = head;
            head.next = tail;

        }
        else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            newnode.next = head;
        }

    }
    public void reverse() {
        Node temp = tail;
        do {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }while(temp != head);
        System.out.print(temp.data);
    }
    public void traverse() {
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while(temp != head);

        System.out.println();
    }
    public void delete(int val) {
        Node temp = head;
        Node pre = null;
        while(temp != null && temp.data != val) {
            pre = temp;
            temp = temp.next;
        }
        if(temp != null) {
            pre.next = temp.next;
        }
        System.out.println();
        

    }

    public static void main(String[] args) {
        LinkedList ans = new LinkedList();
        ans.insert(1);
        ans.insert(2);
        ans.insert(3);
        ans.insert(4);
        ans.insert(5);
        ans.traverse();
        ans.reverse();
        ans.delete(3);
        ans.traverse();
    }
}

package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
/*       list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println("Before Deletion : ");
//        list.traverse();
//        System.out.println();
       list.delete(3);
//        System.out.println("After Deletion");
//        list.traverse();
*/

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.delete(4);
        list.traverse();


    }
}

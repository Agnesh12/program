package BinaryTree;
class Node{
    int data;
    Node left;
    Node right;
    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
public class binarytree {
    Node root;
    binarytree() {
        root = null;
    }
    public void inorder(Node node) {
        if(node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(" " + node.data);
        inorder(node.right);
    }

    public static void main(String[] args) {
        binarytree tree = new binarytree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.inorder(tree.root);

    }

}


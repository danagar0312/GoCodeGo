package BinaryTree;

class Node {
    int data;
    Node left;
    Node right;
}

class BinaryTree {
    public Node createNewNode(int val) {
        Node newnode = new Node();
        newnode.data = val;
        newnode.left = null;
        newnode.right = null;
        return newnode;
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}

public class BinaryTreeApp {

    public static void main(String[] args) {

        BinaryTree a = new BinaryTree();

        Node root = a.createNewNode(21);
        root.left = a.createNewNode(734);
        root.right = a.createNewNode(32);
        root.left.left = a.createNewNode(324);
        root.left.right = a.createNewNode(33);
        root.left.right.left = a.createNewNode(5);
        root.left.right.right = a.createNewNode(110);
        root.right.right = a.createNewNode(19);
        root.right.right.left = a.createNewNode(4);

        System.out.print("Inorder: ");
        a.inOrder(root);
        System.out.println();

        System.out.print("PreOrder: ");
        a.preOrder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        a.postorder(root);
        System.out.println();
    }
}

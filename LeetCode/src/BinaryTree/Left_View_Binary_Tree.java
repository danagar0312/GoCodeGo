package BinaryTree;

import java.util.PriorityQueue;
import java.util.Queue;

public class Left_View_Binary_Tree {

    // DFS Approach

    static int currentDepth;

    public static void getLeftView(Node node, int level){
        if(node == null) return;

        if(currentDepth < level){
            System.out.println(node.data + " ");
            currentDepth++;
        }

        getLeftView(node.left, level + 1);
        getLeftView(node.right, level + 1);

    }

    // BFS Approach

    public void getLeftViewBFS(Node node) {

        if(node == null) return;

        // declare queue and starting node to it

        Queue<Node> queue = new PriorityQueue<>();
        queue.add(node);

        while(!queue.isEmpty()){

            for(int i = 1; i <= queue.size(); i++){

                Node temp = queue.poll();

                if(i == 1){
                    System.out.print(node.data);
                }

                if(temp.left != null){
                    queue.add(node.left);
                }
                if(temp.right != null){
                    queue.add(node.right);
                }
            }
        }

    }

    public static void main(String[] args) {

        BinaryTree a = new BinaryTree();

        Node root = a.createNewNode(21);
        root.left = a.createNewNode(17);
        root.right = a.createNewNode(35);
        root.left.left = a.createNewNode(266);
        root.left.right = a.createNewNode(63);
        root.left.right.left = a.createNewNode(523);
        root.left.right.right = a.createNewNode(113);
        root.right.right = a.createNewNode(91);
        root.right.right.left = a.createNewNode(477);

        getLeftView(root, 0);
    }

}

package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Right_View_Binary_Tree {

    // BFS

    public List<Integer> getRightViewBFS(Node root) {

        // declare queue and starting node to it

        Queue<Node> queue = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;
        queue.add(root);

        while (!queue.isEmpty()) {

            int current_size = queue.size();

            while (current_size-- > 0) {

                Node temp = queue.poll();
                if (current_size == 0) result.add(temp.data);

                if (temp.left != null) {
                    queue.add(root.left);
                }
                if (temp.right != null) {
                    queue.add(root.right);
                }
            }
        }

        return result;

    }


    // DFS

    static int currentDepth;

    public static void geRightView(Node node, int level){
        if(node == null) return;

        if(currentDepth <= level){
            System.out.println(node.data + " ");
            currentDepth++;
        }

        geRightView(node.right, level + 1);
        geRightView(node.left, level + 1);

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

        geRightView(root, 0);
    }

}

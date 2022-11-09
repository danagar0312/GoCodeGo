package BinaryTree;

import apple.laf.JRSUIUtils;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int data;
    int height;
}

public class Top_View_Binary_Tree {

    public static void topView(TreeNode node){
        if (node == null){
            return;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(node);

        while(!queue.isEmpty()){
            TreeNode temp = queue.remove();

            int current_level = temp.height;

            if(map.get(current_level) == null){
                map.put(current_level, temp.data);
            }

            if(temp.left != null){
                temp.left.height = current_level - 1;
                queue.add(temp.left);
            }

            if(temp.right != null){
                temp.right.height = current_level + 1;
                queue.add(temp.right);
            }

        }
        System.out.println(map.values());
    }

    public TreeNode createNewTreeNode(int val) {
        TreeNode newNode = new TreeNode();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    public static void main(String[] args) {

        Top_View_Binary_Tree a = new Top_View_Binary_Tree();

        TreeNode root = a.createNewTreeNode(21);
        root.left = a.createNewTreeNode(17);
        root.right = a.createNewTreeNode(35);
        root.left.left = a.createNewTreeNode(266);
        root.left.right = a.createNewTreeNode(63);
        root.left.right.left = a.createNewTreeNode(523);
        root.left.right.right = a.createNewTreeNode(113);
        root.right.right = a.createNewTreeNode(91);
        root.right.right.left = a.createNewTreeNode(477);

        topView(root);
    }
}

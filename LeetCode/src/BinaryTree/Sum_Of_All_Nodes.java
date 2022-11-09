package BinaryTree;



public class Sum_Of_All_Nodes {

    public static int getSumOfAllNodesInBT(Node node){
        if (node == null) return 0;
        return node.data + getSumOfAllNodesInBT(node.left) + getSumOfAllNodesInBT(node.right);
    }

    public static void main(String[] args) {

        BinaryTree a = new BinaryTree();

        Node root = a.createNewNode(21);
        root.left = a.createNewNode(72);
        root.right = a.createNewNode(54);


        System.out.print("Total Sum: " + getSumOfAllNodesInBT(root));
    }
}

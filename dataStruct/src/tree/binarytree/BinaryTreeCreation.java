package tree.binarytree;

public class BinaryTreeCreation {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class BinaryTree{
        static int index = -1;
        //create tree
        public static Node buildTree(int nodes[]){
            index++;
            if( nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

    }
    public static void main(String[] args) {

        int nodes[] = { 1,4,5,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);
    }
}

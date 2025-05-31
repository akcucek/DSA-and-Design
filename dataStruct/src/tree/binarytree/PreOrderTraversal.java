package tree.binarytree;

public class PreOrderTraversal {

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

        public static Node buildTree(int nodes[]){
            //base condition
            index++;
            if( nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root){
            //base condition
            if( root == null){
                return;
            }
            System.out.print( root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {

        int nodes[] = {0, 4, 5, -1, -1, -1, 6, -1, -1};
        /*
        0
       / \
      4   6
     /
    5
         */
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        tree.preOrder(root);
    }
}

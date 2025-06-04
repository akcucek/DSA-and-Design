package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    //create a node
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }
    //create binary tree
    static class BinaryTree{
        static int index= -1;
        public static Node buildTree(int nodes[]){
            index++;
            //base condition
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.data = nodes[index];
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void levelOrder(Node root){
            //base condition
            if( root == null){
                return ;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if( currNode == null){
                    System.out.println();
                    if( q.isEmpty()){
                        break;
                    }else {
                        q.add(null);
                    }
                }else {
                    System.out.print(currNode.data + " ");
                    if( currNode.left != null){
                        q.add( currNode.left);
                    }
                    if ( currNode.right != null){
                        q.add( currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int nodes[] = {0, 4, 5, -1, -1, -1, 6, -1, -1};
        /*
        0
       / \
      4   6
     /
    5 */
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        tree.levelOrder(root);
    }
}

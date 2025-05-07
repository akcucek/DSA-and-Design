package linkedlist.singlelinkedlist;

public class SingleLinkedListCreation {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    /*Add First in LinkedList
      1-Create a new Node
      2-new node's next = head
      3-head = newNode
    */
    public void addFirst(int data){
        //Step 1 Create new Node
        Node newNode = new Node(data);
        if( head == null){
            head = tail = newNode;
            return;
        }
        //Step 2 newNode next = head
        newNode.next = head;
        //Step 3 head = newNode
        head = newNode;
    }
    
    public static void main(String[] args){

        SingleLinkedListCreation ll = new SingleLinkedListCreation();
        
    }
}

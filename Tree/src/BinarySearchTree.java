

public class BinarySearchTree {

    class Node{
        int value ;
        Node left;
        Node right;

        public Node(int value ){
            this.value=value;
        }
    }

    Node root;

    public BinarySearchTree(){
        this.root=null;
    }


    // insert using recursion
    public void insert(int value){
        root = insertRec(root,value);
    }

    public Node insertRec(Node root , int value){

        Node newnode = new Node(value);

        if (root == null) {
            root=newnode;
            return root;
        }

        if (value > root.value) {
            root.right = insertRec(root.right , value);
        }else if (value < root.value) {
            root.left = insertRec(root.left , value);
        }

        return root;
    }

    public void print(){
        printRec(root);
    }

    public void printRec(Node root){
        if (root != null) {
            printRec(root.left);
            System.out.println(root.value);
            printRec(root.right);
        }
    }




}

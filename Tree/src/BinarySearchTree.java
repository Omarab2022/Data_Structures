

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

    //insert with loops

    public void InsertWithloops(int value){

        Node newnode = new Node(value);

        if (root == null) {
            root=newnode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (current!=null){
            parent = current;

            if (value < current.value) {
                current = current.left;
            } else if (value > current.value ) {
                current = current.right;
            }else{
                return;
            }
        }

        if (value > parent.value){
            parent.right = newnode;

        }else if (value < parent.value){
            parent.left=newnode;
        }

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


    public Boolean Contain(int value ){

        Node newnode = new Node(value);

        Node temp = root;

        if (root == null) {
            return false;
        }

        while (temp != null){
            if (value == temp.value) {
                System.out.println("yes this value : " + value + " exist in this tree");
                return true;

            }else if (value < temp.value) {
                temp=temp.left;
            } else if (value > temp.value) {
                temp=temp.right;
            }
        }
        return false;
    }



}

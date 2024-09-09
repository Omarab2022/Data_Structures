public class Stack {

    class  Node {
        int value;
        Node Next ;

        public Node(int value){
            this.value=value;
        }
    }

    private Node top ;
    private int height ;

    public Stack(int value){
        Node newnode = new Node(value);
        top = newnode;
        height=1;
    }

    public void printStack(){
        Node temp = top;
        while (temp !=null){
            System.out.println(temp.value);
            temp = temp.Next;
        }
    }

}

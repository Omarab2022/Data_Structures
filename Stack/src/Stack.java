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
        this.getHeight();
        this.getTop();
        Node temp = top;
        while (temp !=null){
            System.out.println( "Value : " + temp.value);
            temp = temp.Next;
        }

        System.out.println("----------------------------------------");
    }

    public void getTop(){
        System.out.println("Top : " + top.value);
    }

    public void getHeight(){
        System.out.println("Height : " + height);
    }

    public void Push(int value){

        Node newnode = new Node(value);

        if(height==0){
            top = newnode;
        }else{
            newnode.Next=top;
            top=newnode;
        }
        height++;
    }

}

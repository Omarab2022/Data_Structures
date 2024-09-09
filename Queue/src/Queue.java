public class Queue {

    class Node {
        int value ;
        Node next ;

        public Node(int value){
            this.value=value;
        }
    }

    private Node first ;
    private Node last ;
    private int lenght ;

    public Queue (int value){
        Node newnode =new Node(value);
        first=newnode;
        last=newnode;
        lenght=1;
    }

    public void printQueue(){
        this.getfirst();
        this.getlast();
        this.getlenght();
        Node temp = first;

        while (temp!=null){
            System.out.println("Value : " + temp.value);
            temp=temp.next;
        }
    }

    public void getfirst(){
        System.out.println("First : " + first.value);
    }

    public void getlast(){
        System.out.println("Last : " + last.value);
    }

    public void getlenght(){
        System.out.println("Length : " + lenght);
    }


}

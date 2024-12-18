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

        System.out.println("---------------------------");
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

    public void Enqueue(int value){
        Node newnode = new Node(value);

        if (lenght == 0) {
            first = newnode;
            last=newnode;
        }else{
            last.next=newnode;
            last=newnode;
        }

        lenght++;
    }

    public Node Dequeue(){
        Node temp = first;


        if (lenght==0){
            return null;
        }

        if (lenght ==1) {
            first=null;
            last=null;
        }
        else {
          first = temp.next;
          temp.next=null;
        }

        lenght--;
        return temp;
    }


}

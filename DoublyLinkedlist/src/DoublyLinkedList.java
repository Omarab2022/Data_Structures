public class DoublyLinkedList {

    class Node {
        int value ;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
    }

   private int value;
    private Node head;
    private Node tail;
    private  int length;

    public DoublyLinkedList(int value){
        Node newnode = new Node(value);
        head=newnode;
        tail=newnode;
        length=1;
    }


    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }


    public void append(int value){

        Node newnode = new Node(value);

        if (length == 0){
            head=newnode;
            tail=newnode;
        }

        tail.next = newnode ;
        newnode.prev = tail;
        tail=newnode;

        length++;

    }

    public Node removeLast(){
        Node temp = tail;

        if (length==0){
            return null;
        }else if (length== 1) {
            head=null;
            tail=null;
        }else{
            temp.prev.next = null;
            tail = temp.prev;
            temp.prev =null;

        }
        length--;
        if (length == 0) {
            head=null;
            tail=null;
        }
        return temp ;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;

        Node temp = head;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }

        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;

        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }

        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;

        before.next = newNode;
        newNode.prev = before;
        newNode.next = after;
        after.prev = newNode;

        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node temp = get(index);

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }

    public void swapFirstLast() {
        // Check if the list has fewer than 2 elements
        if (length < 2) {
            return; // No need to swap if the list is empty or has only one node
        }

        // Swap the values of head and tail
        int tempValue = head.value;
        head.value = tail.value;
        tail.value = tempValue;
    }


}

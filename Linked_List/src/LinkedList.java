import java.util.HashSet;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

     class Node {
        int value;
        Node next;

        public Node(int value ) {
            this.value=value;
        }
    }

    public LinkedList(int value){
        Node newnode = new Node(value);
        head=newnode;
        tail=newnode;
        length++;
    }


    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
         return this.tail;
    }

    public int getLength(){
         return this.length;
    }




    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    public Node removeLast(){

         Node temp = head;
         Node pre = head ;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            head=null;
            tail=null;
            length--;
            return temp;
        }

        while (temp.next!=null){

            pre =temp;
            temp=temp.next;

        }
        tail=pre;
        pre.next=null;

        length--;
        return temp;

    }

    public void prepend(int value){

         Node newnode = new Node(value);

        if (length == 0) {
            head=newnode;
            tail=newnode;
        }else {
            newnode.next=head;
            head=newnode;
        }
        length++;
    }

    public Node removeFirst(){

         Node temp = head ;

        if (length == 0) {
            return null;
        } else if (length == 1) {
            head=null;
            tail=null;
            length--;
            return temp;
        }

        head=temp.next;
        temp.next=null;

        length--;
        return temp;
    }

    public Node get(int index){

         Node temp = head;

         if(index<0 || index >= length){
             return null;
         }
             for (int i = 0; i < index; i++) {
                 temp = temp.next;
             }

        return temp;
    }

    public boolean set (int index , int value){

        if (index <0 || index >= length) {
            return false;
        }

         Node temp = get(index) ;

         temp.value = value;

         return true;

    }

    public boolean insert(int index, int value)  {
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
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node temp = get(index);

        if (index == 0) {
            // Remove the first node
            removeFirst();
        } else if (index == length - 1) {
            // Remove the last node
            removeLast();
        } else {
            Node pre = get(index - 1);
            pre.next = temp.next;
            temp.next = null;
            length--;
        }

        return temp;
    }

    public void reverse(){
         Node temp = head ;
         head=tail;
         tail=temp;

         Node after = temp.next;
         Node before = null;

        for (int i = 0; i < length; i++) {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }

    public Node findMiddleNode(){

         Node slow = head;
         Node fast = head;

         while (fast != null && fast.next!=null){
             slow = slow.next;
             fast=fast.next.next;
         }

         return slow;

    }


    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public Node findKthFromEnd(int k){

         Node temp = head ;

        for (int i = 0; i < length -k; i++) {
            temp=temp.next;
        }

        return temp ;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void partitionList(int x) {
        // Step 1: Check for an empty list.
        // If the list is empty, there is nothing
        // to partition, so we exit the method.
        if (head == null) return;

        // Step 2: Create two dummy nodes.
        // These dummy nodes act as placeholders
        // to simplify list manipulation.
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);

        // Step 3: Initialize pointers for new lists.
        // 'prev1' and 'prev2' will track the end nodes of
        // the two lists that are being created.
        Node prev1 = dummy1;
        Node prev2 = dummy2;

        // Step 4: Start with the head of the original list.
        Node current = head;

        // Step 5: Iterate through the original list.
        while (current != null) {

            // Step 6: Compare current node value with 'x'.
            // Nodes are partitioned based on their value
            // being less than or greater than/equal to 'x'.

            // Step 6.1: If value is less than 'x',
            // add node to the first list.
            if (current.value < x) {
                prev1.next = current;  // Link node to the end of the first list.
                prev1 = current;       // Update the end pointer of the first list.
            } else {
                // Step 6.2: If value is greater or equal,
                // add node to the second list.
                prev2.next = current;  // Link node to the end of the second list.
                prev2 = current;       // Update the end pointer of the second list.
            }

            // Move to the next node in the original list.
            current = current.next;
        }

        // Step 7: Terminate the second list.
        // This prevents cycles in the list.
        prev2.next = null;

        // Step 8: Connect the two lists.
        // The first list is followed by the second list.
        prev1.next = dummy2.next;

        // Step 9: Update the head of the original list.
        // The head now points to the start of the first list.
        head = dummy1.next;
    }

    public void removeDuplicates(){

        HashSet values = new HashSet<>();

        Node prev = null;
        Node current = head;

        while (current!=null){

            if (!values.contains(current.value)) {
                values.add(current.value);
                prev= current;
                current = current.next;
            }else {
                prev.next=current.next;
                current = current.next;
            }

        }
    }

    public int binaryToDecimal() {
        Node current = head;
        int num = 0;

        while (current != null) {
            // Shift left by multiplying num by 2 and add the current node's value
            num = num * 2 + current.value;
            current = current.next;
        }

        return num;
    }




}

public class Main {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList(2);

        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);

        linkedList.printList();
        linkedList.removeLast();

        linkedList.prepend(1);
        linkedList.printList();

        linkedList.removeFirst();
        linkedList.printList();

        System.out.println("Get value of index 2 is : " + linkedList.get(1).value);

        linkedList.set(1,88);
        linkedList.printList();

        linkedList.remove(5);
        linkedList.printList();

        linkedList.reverse();
        linkedList.printList();


        System.out.println("New value of index 2 is : " + linkedList.get(1).value);

        System.out.println("head is : " + linkedList.getHead().value);
        System.out.println("tail is : "+ linkedList.getTail().value);
        System.out.println("length is : "+ linkedList.getLength());

        LinkedList linkedlist2 = new LinkedList(1);
        linkedlist2.append(2);
        linkedlist2.append(3);
        linkedlist2.append(4);
        linkedlist2.append(5);
        linkedlist2.append(6);
        linkedlist2.append(7);
        linkedlist2.append(8);


        System.out.println("Middle of list is : " + linkedlist2.findMiddleNode().value);




    }
}
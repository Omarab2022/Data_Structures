public class Main {
    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.append(5);

        System.out.println("List after appending 2, 3, 4, 5:");
        doublyLinkedList.printAll();

        doublyLinkedList.removeLast();
        System.out.println("\nList after removing last element:");
        doublyLinkedList.printAll();

        doublyLinkedList.prepend(0);
        System.out.println("\nList after prepending 0:");
        doublyLinkedList.printAll();

        doublyLinkedList.removeFirst();
        System.out.println("\nList after removing first element:");
        doublyLinkedList.printAll();

        DoublyLinkedList.Node nodeAtIndex2 = doublyLinkedList.get(2);
        System.out.println("\nValue at index 2: " + (nodeAtIndex2 != null ? nodeAtIndex2.value : "null"));

        boolean setResult = doublyLinkedList.set(1, 10);
        System.out.println("\nSet value at index 1 to 10: " + setResult);
        doublyLinkedList.printAll();

        boolean insertResult = doublyLinkedList.insert(2, 99);
        System.out.println("\nInsert value 99 at index 2: " + insertResult);
        doublyLinkedList.printAll();

        DoublyLinkedList.Node removedNode = doublyLinkedList.remove(2);
        System.out.println("\nRemove element at index 2 (99): " + (removedNode != null ? removedNode.value : "null"));
        doublyLinkedList.printAll();


        System.out.println("Before swapping first and last:");
        doublyLinkedList.printAll();

        doublyLinkedList.swapFirstLast();

        System.out.println("\nAfter swapping first and last:");
        doublyLinkedList.printAll();
    }
}
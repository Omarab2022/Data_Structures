public class Main {
    public static void main(String[] args) {


        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);

        bst.InsertWithloops(40);
        bst.InsertWithloops(90);

        bst.print();

        bst.Contain(90);

       boolean contain =  bst.Contain(444);
       if (contain == false){
           System.out.println("NOOOO this value not exist in this tree");
       }

    }
}
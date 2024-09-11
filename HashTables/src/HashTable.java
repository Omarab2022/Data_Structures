public class HashTable {

    class Node {

        String key ;
        int value;
        Node next ;

        public Node(String key , int value){
            this.key=key;
            this.value=value;
        }

    }

    private int size = 7 ;
    private Node[] DataMap ;

    public HashTable() {
        DataMap = new Node[size];
    }

    public void PrintHashTable(){
        for (int i = 0; i < DataMap.length; i++) {

            System.out.println( i + " : ");
            Node temp = DataMap[i];

            while (temp!= null){
                System.out.println( " { key : " + temp.key + " ; " + temp.value + " } " );
                temp=temp.next;
            }
        }
    }


    public int Hash(String key){

        int hash = 0 ;
        char[] keychars = key.toCharArray();

        for (int i = 0; i < keychars.length; i++) {

            int asciivalue = keychars[i];

            hash = (hash+asciivalue*23)% DataMap.length ;

        }
        return hash ;
     }

}

import java.util.ArrayList;

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

     public void set(String key  , int value){

        int index  = Hash(key);
        Node newnode = new Node(key,value);

         if (DataMap[index] == null) {
             DataMap[index] = newnode ;
         }else {
             Node temp = DataMap[index];
             while (temp.next != null){
                 temp = temp.next;
             }

             temp.next = newnode;
         }

     }


     public int get(String key){

        int index = Hash(key);
        Node temp = DataMap[index];

        while (temp!=null){
            if (temp.key == key) {
                System.out.println("exist");
                return temp.value;
            }
        }

        return 0 ;
     }

     public ArrayList KeysToArray(){

        ArrayList<String> myarray = new ArrayList<>();

         for (int i = 0; i < DataMap.length; i++) {

             Node temp = DataMap[i];
             while (temp!=null){
                 myarray.add(temp.key);
                 temp=temp.next;
             }

         }

         for (int j = 0; j < myarray.size(); j++) {
             System.out.print( myarray.get(j) + " ; ");
         }

         return myarray;
     }


}

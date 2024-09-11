public class Main {
    public static void main(String[] args) {


        HashTable hashTable = new HashTable();

        hashTable.set("omar",20);
        hashTable.set("anas",22);
        hashTable.set("ahmed",23);
        hashTable.set("mohamed",21);
        hashTable.set("jamal",26);
        hashTable.set("yassin",30);

        hashTable.PrintHashTable();

        hashTable.get("anas");

        hashTable.KeysToArray();

    }
}
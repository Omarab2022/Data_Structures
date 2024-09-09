public class Main {
    public static void main(String[] args) {


        Queue newqueue = new Queue(1);

        newqueue.printQueue();

        newqueue.Enqueue(2);
        newqueue.Enqueue(3);
        newqueue.Enqueue(4);

        newqueue.printQueue();

        newqueue.Dequeue();
        newqueue.printQueue();
    }
}
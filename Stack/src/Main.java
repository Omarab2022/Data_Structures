public class Main {
    public static void main(String[] args) {


        Stack newstack = new Stack(1);

        newstack.printStack();

        newstack.Push(2);
        newstack.Push(3);
        newstack.Push(4);

        newstack.printStack();
    }
}
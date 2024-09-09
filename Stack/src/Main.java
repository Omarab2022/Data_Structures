import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Stack newstack = new Stack(1);

        newstack.printStack();

        newstack.Push(2);
        newstack.Push(3);
        newstack.Push(4);

        newstack.printStack();


        newstack.Pop();

        newstack.printStack();



        class Stack<T> {

            private ArrayList<T> stackList = new ArrayList<>();

            public ArrayList<T> getStackList() {
                return stackList;
            }

            public void printStack() {
                for (int i = stackList.size() - 1; i >= 0; i--) {
                    System.out.println(stackList.get(i));
                }
            }

            public boolean isEmpty() {
                return stackList.size() == 0;
            }

            public T peek() {
                if (isEmpty()) {
                    return null;
                } else {
                    return stackList.get(stackList.size() - 1);
                }
            }

            public int size() {
                return stackList.size();
            }

            public void push(T value) {
                stackList.add(value);
            }

            public T pop() {
                if (isEmpty()) {
                    return null;
                } else {
                    return stackList.remove(stackList.size() - 1);
                }
            }

        }
    }}


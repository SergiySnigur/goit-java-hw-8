package stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(35);
        myStack.push(40);
        myStack.push(90);
        myStack.push(56);
        myStack.push(81);
        myStack.push(93);
        myStack.push(78);

        System.out.println(myStack.size());
        System.out.println(myStack.remove(0));
        System.out.println(myStack.toString());
        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.toString());
        System.out.println(myStack.size());


    }
}
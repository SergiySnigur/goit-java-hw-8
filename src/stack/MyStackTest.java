package stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(35);
        stack.push(40);
        stack.push(90);
        stack.push(56);
        stack.push(81);
        stack.push(93);
        stack.push(78);

        System.out.println(stack.toString());
//        System.out.println(stack.size());
        System.out.println(stack.pop());
//        System.out.println(stack.remove(6));
//        stack.clear();
        System.out.println(stack.toString());
    }
}
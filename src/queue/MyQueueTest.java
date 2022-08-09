
package queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(7);

        System.out.println(myQueue.remove(0));
        System.out.println(myQueue.toString());
        System.out.println("********************");
        System.out.println(myQueue.remove(0));
        System.out.println(myQueue.toString());
        System.out.println("********************");
        System.out.println(myQueue.remove(0));
        System.out.println(myQueue.toString());
        System.out.println("********************");
        System.out.println(myQueue.remove(0));
        System.out.println(myQueue.toString());

    }
}
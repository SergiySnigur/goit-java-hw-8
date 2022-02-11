package linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Serhii");
        list.add("Kate");
        list.add("Andrew");
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.remove(3));
        list.clear();
        System.out.println(list.size());
    }
}
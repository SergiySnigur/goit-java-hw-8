package linkedlist;

public class MyLinkedList<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList() {
        this.lastNode = new Node(null, this.firstNode, null);
        this.firstNode = new Node<>(null, null, this.lastNode);
    }

    public void add(E value) {
        Node<E> prev = this.lastNode;
        prev.setCurrentElement(value);
        this.lastNode = new Node<E>(null, prev, null);
        prev.setNextElement(this.lastNode);
        this.size++;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Position is Invalid");
        }
        Node<E> target = this.firstNode.getNextElement();
        for (int i = 0; i < index; i += 1) {
            target = (Node<E>) getNode(target);
        }
        Node<E> prevNode = target.getPrevElement();
        Node<E> nextNode = target.getNextElement();
        prevNode.setNextElement(nextNode);
        nextNode.setPrevElement(prevNode);
        size--;
        return target.getCurrentElement();
    }

    public void clear() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
        System.out.println("Is clear!");
    }

    public int size() {
        return this.size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Position is Invalid");
        }
        Node<E> target = this.firstNode.getNextElement();
        for (int i = 0; i < index; i += 1) {
            target = (Node<E>) getNode(target);
        }
        return target.getCurrentElement();
    }

    // use in method E get(int index) and E remove(int index)
    public E getNode(Node<E> node) {
        return (E) node.getNextElement();
    }
}
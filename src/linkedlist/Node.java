package linkedlist;

public class Node<E> {
    private E currentElement;
    private Node<E> nextElement;
    private Node<E> prevElement;

    public Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
        this.currentElement = currentElement;
        this.prevElement = prevElement;
        this.nextElement = nextElement;
    }

    public E getCurrentElement() {
        return currentElement;
    }

    public void setCurrentElement(E currentElement) {
        this.currentElement = currentElement;
    }

    public Node<E> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }

    public Node<E> getPrevElement() {
        return prevElement;
    }

    public void setPrevElement(Node<E> prevElement) {
        this.prevElement = prevElement;
    }
}
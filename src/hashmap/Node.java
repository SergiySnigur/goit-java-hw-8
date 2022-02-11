package hashmap;

public class Node<K, V> {
    private K key;
    private V value;
    private Node<K, V> nextNode;

    public Node(K key, V value, Node<K, V> nextNode) {
        this.key = key;
        this.value = value;
        this.nextNode = nextNode;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<K, V> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}

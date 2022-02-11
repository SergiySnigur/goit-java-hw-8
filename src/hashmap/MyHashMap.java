package hashmap;

public class MyHashMap<K, V> {
    private Node<K, V>[] table;
    private int capacity = 4;
    private int size;

    public MyHashMap() {
        this.table = new Node[capacity];
    }

    public void put(K key, V value) {
        if (key == null) return;
        int index = hash(key);
        Node<K, V> newNode = new Node<>(key, value, null);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node<K, V> prev = null;
            Node<K, V> current = table[index];
            while (current != null) {
                if (current.getKey().equals(key)) {
                    if (prev == null) {
                        newNode.setNextNode(current.getNextNode());
                        table[index] = newNode;
                        return;
                    } else {
                        newNode.setNextNode(current.getNextNode());
                        prev.setNextNode(newNode);
                        return;
                    }
                }
                prev = current;
                current = current.getNextNode();
            }
            prev.setNextNode(newNode);
        }
        size++;
    }

    public V get(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return null;
        } else {
            Node<K, V> temp = table[hash];
            while (temp != null) {
                if (temp.getKey().equals(key))
                    return temp.getValue();
                temp = temp.getNextNode();
            }
            return null;
        }
    }

    public void remove(K key) {

        if (key == null) {
            throw new IllegalArgumentException("Null Key!");
        }

        int hash = hash(key);

        if (table[hash] == null) {
        } else {
            Node<K, V> previous = null;
            Node<K, V> current = table[hash];

            while (current != null) {
                if (current.getValue().equals(key)) {
                    if (previous == null) {
                        table[hash] = table[hash].getNextNode();
                    } else {
                        previous.setNextNode(current.getNextNode());
                    }
                }
                previous = current;
                current = current.getNextNode();
            }
            this.size--;
        }
    }

    public int size() {
        return this.size;
    }

    public int hash(K key) {
        return key.hashCode() % capacity;
    }

    public void clear() {
        this.table = null;
        this.size = 0;
        System.out.println("Is clear");
    }
}


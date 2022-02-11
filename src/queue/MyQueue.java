package queue;


import java.util.EmptyStackException;
import java.util.StringJoiner;

public class MyQueue<T> {

    private int counter = 0;
    private Object[] elements = new Object[counter];

    public void add(T value) {
        if (value == null) {
            throw new NullPointerException();
        } else {
            Object[] array = new Object[counter + 1];
            System.arraycopy(this.elements, 0, array, 0, this.elements.length);
            this.elements = array;
            this.elements[counter++] = value;
        }
    }

    public T remove(int index) {
        if (index > this.elements.length & index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            Object result = this.elements[index];
            Object[] array = new Object[this.elements.length - 1];
            for (int i = 0, j = 0; i < this.elements.length; i += 1) {
                if (i == index) {
                    continue;
                } else {
                    array[j++] = this.elements[i];
                }
            }
            this.elements = array;
            return (T) result;
        }
    }

    public void clear() {
        Object[] array = {};
        this.elements = array;
    }

    public int size() {
        return this.elements.length;
    }

    public T peek() {
        if (this.elements.length == 0) {
            return null;
        } else {
            return (T) this.elements[0];
        }
    }

    public T poll() {
        if (this.elements.length == 0) {
            throw new EmptyStackException();
        } else {
            Object result = this.elements[0];
            Object[] array = new Object[this.elements.length - 1];
            System.arraycopy(this.elements, 1, array, 0, this.elements.length - 1);
            this.elements = array;
            return (T) result;
        }

    }

    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < this.elements.length; i += 1) {
            result.add(elements[i].toString());
        }
        return "[" + result + "]";
    }
}
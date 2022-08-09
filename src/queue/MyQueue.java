package queue;

import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class MyQueue<T> {

    private int size = 0;
    private Object[] elements = new Object[size];

    public void add(T value) {
        if (value == null) {
            throw new NullPointerException();
        }
        Object[] array = new Object[size + 1];
        System.arraycopy(elements, 0, array, 0, size);
        elements = array;
        elements[size++] = value;
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return (T) elements[0];
    }

    public T poll() {
        if (size == 0) {
            return null;
        }
        Object result = elements[0];
        Object[] array = new Object[size - 1];
        System.arraycopy(elements, 1, array, 0, size - 1);
        elements = array;
        size--;
        return (T) result;
    }

    public T remove(int index) {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        if (index > size & index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T removedElement = (T) elements[index];
        elements[index] = null;
        Object[] newArray = new Object[size - 1];
        System.arraycopy(elements, index + 1, newArray, index, size - index - 1);
        elements = newArray;
        size--;
        return removedElement;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (Object element : elements) {
            result.add(element.toString());
        }
        return "[" + result + "]";
    }
}
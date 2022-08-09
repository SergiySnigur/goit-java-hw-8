package stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class MyStack<T> {

    private int size = 0;
    private Object[] elements = new Object[size];

    public T push(T value) {
        Object[] array = new Object[size + 1];
        System.arraycopy(elements, 0, array, 0, size);
        elements = array;
        elements[size++] = value;
        return (T) value;
    }

    public T peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return (T) elements[size - 1];
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = this.elements[size - 1];
        Object[] array = new Object[size - 1];
        System.arraycopy(elements, 0, array, 0, size - 1);
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
        for (int i = 0; i < size; i++) elements[i] = null;
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
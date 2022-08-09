package arraylist;

import java.util.StringJoiner;

public class MyArrayList<T> {

    private static final int INIT_SIZE = 10;
    private int size = 0;
    private Object[] array = new Object[INIT_SIZE];

    public void add(T value) {
        if (size == array.length) {
            Object[] newArray = new Object[(int) (size * 1.5)];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = value;
    }

    public T remove(int index) {
        if (index > size && index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T removedElement = (T) array[index];
        array[index] = null;
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return removedElement;
    }

    public T get(int index) {
        if (index > size && index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i += 1) {
            result.add(array[i].toString());
        }
        return "[" + result + "]";
    }
}
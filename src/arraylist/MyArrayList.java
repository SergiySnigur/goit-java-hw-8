package arraylist;

import java.util.StringJoiner;

public class MyArrayList<T> {

    private static final int INIT_SIZE = 10;
    private int counter = 0;
    private Object[] array = new Object[INIT_SIZE];

    public void add(T value) {
        if (counter >= array.length) {
            Object[] newArray = new Object[(int) (array.length * 1.5)];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[counter++] = value;
    }

    public void remove(int index) {
        if (index > counter & index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, counter - index - 1);
        array[counter--] = null;
    }

    public void clear() {
        Object[] array = {};
        this.array = array;
    }

    public int size() {
        return counter;
    }

    public T get(int index) {
        if (index > counter & index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < counter; i += 1) {
            result.add(array[i].toString());
        }
        return "[" + result + "]";
    }
}
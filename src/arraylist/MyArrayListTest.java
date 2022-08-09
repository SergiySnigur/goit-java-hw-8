
package arraylist;

import javax.sound.midi.Soundbank;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Number> arrayListTest = new MyArrayList<>();

        arrayListTest.add(1);
        arrayListTest.add(2);
        arrayListTest.add(3);
        arrayListTest.add(4);
        arrayListTest.add(5);
        arrayListTest.add(6);
        arrayListTest.add(7);
        arrayListTest.add(8);
        arrayListTest.add(9);
        arrayListTest.add(10);
        arrayListTest.add(11);
        arrayListTest.add(12);
        arrayListTest.add(13);
        arrayListTest.add(14);

        System.out.println("Array before remove element: " + arrayListTest.toString());
        System.out.println("Get element before remove: " + arrayListTest.get(10));
        System.out.println("Size before remove element: " + arrayListTest.size());

        System.out.println("---------------------------------------------------");

        System.out.println("Removed element: " + arrayListTest.remove(0));
        System.out.println("Array after remove element: " + arrayListTest.toString());
        System.out.println("Get element after remove: " + arrayListTest.get(10));
        System.out.println("Size after remove element: " + arrayListTest.size());

        System.out.println("---------------------------------------------------");

        arrayListTest.clear();
        System.out.println(arrayListTest.toString());
        System.out.println(arrayListTest.size());

    }
}
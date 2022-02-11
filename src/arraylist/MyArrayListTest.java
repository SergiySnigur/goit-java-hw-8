
package arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Number> arrayListTest = new MyArrayList<>();

        arrayListTest.add(22);
        arrayListTest.add(100);
        arrayListTest.add(50);
        arrayListTest.add(182);
        arrayListTest.add(302);
        arrayListTest.add(444);
        arrayListTest.add(82);
        arrayListTest.add(90);
        arrayListTest.add(95);
        arrayListTest.add(87);
        arrayListTest.add(12);
        arrayListTest.add(4);
        arrayListTest.add(10000);
        arrayListTest.add(78);

        System.out.println(arrayListTest.toString());
        System.out.println(arrayListTest.size());
        arrayListTest.remove(2);
        System.out.println(arrayListTest.size());
        System.out.println(arrayListTest.toString());
    }
}
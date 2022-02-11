package hashmap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, String> hashMap = new MyHashMap<>();

        hashMap.put(1, "Serhii");
        hashMap.put(3, "Andrew");
        hashMap.put(4, "Kate");
        hashMap.put(5, "aaa");
        hashMap.put(6, "bbb");
        hashMap.put(7, "sss");
        hashMap.put(8, "bbb");

        System.out.println(hashMap.get(4));
        System.out.println(hashMap.size());
//        hashMap.remove(4);
//        System.out.println(hashMap.size());
    }
}

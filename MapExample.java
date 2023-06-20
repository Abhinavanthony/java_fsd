import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // HashMap Example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);
        System.out.println("HashMap: " + hashMap);

        // TreeMap Example
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("TreeMap: " + treeMap);

        // LinkedHashMap Example
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Cherry", 30);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Hashtable Example
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("John", 25);
        hashtable.put("Alice", 30);
        hashtable.put("Bob", 35);
        System.out.println("Hashtable: " + hashtable);
    }
}

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // insert key-value mappings into the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);map.put("apple", 1);
        map.put("apple", 5);

        // get the value associated with a key
        System.out.println(map.get(1));

        // check if a key exists in the map
        System.out.println(map.containsKey("apple"));

        // remove a key-value mapping from the map
        map.remove("orange");

        // get a set view of the keys in the map
        System.out.println(map.keySet());
    }
}
package stringPrograms;

import java.util.*;

public class HashMapSortByKeyIterator {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // TreeMap sorts keys automatically
        TreeMap<String, String> sortedMap = new TreeMap<>(capitalCities);

        // Getting Iterator from the entry set
        Iterator<Map.Entry<String, String>> iterator = sortedMap.entrySet().iterator();

        // Iterating and printing sorted key-value pairs
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}

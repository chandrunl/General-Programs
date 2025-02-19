package stringPrograms;

import java.util.*;

public class HashMapSortByValueIterator {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Convert HashMap to a List of Map Entries
        List<Map.Entry<String, String>> list = new ArrayList<>(capitalCities.entrySet());

        // Sort the list based on values
        list.sort(Map.Entry.comparingByValue());

        // Using an Iterator to iterate through sorted entries
        Iterator<Map.Entry<String, String>> iterator = list.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}

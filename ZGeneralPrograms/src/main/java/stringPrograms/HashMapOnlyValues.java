package stringPrograms;

import java.util.HashMap;

public class HashMapOnlyValues {
	  public static void main(String[] args) {
		    HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    		    
		    for (String i : capitalCities.values()) {
		      System.out.println(i);
		    }
		  }
}

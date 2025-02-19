package interviewprograms;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoogleSearchURLParser {
    public static void main(String[] args) {
        // Example Google search URL for "Cognizant"
        String googleSearchURL = "https://www.google.com/search?q=Cognizant&oq=Cognizant&aqs=chrome.0.69i59j69i57j0i512j69i60l3j69i65.1478j0j7&sourceid=chrome&ie=UTF-8";
        
        // Extract query parameters
        Map<String, String> queryParams = getQueryParams(googleSearchURL);
        
        // Ask user for a key input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key to fetch the corresponding value: ");
        String key = scanner.nextLine();
        
        // Fetch and display the corresponding value
        String value = queryParams.get(key);
        if (value != null) {
            System.out.println("Value for key '" + key + "' is: " + value);
        } else {
            System.out.println("Key not found in URL.");
        }
        scanner.close();
    }

    private static Map<String, String> getQueryParams(String url) {
        Map<String, String> queryParams = new HashMap<>();
        try {
            URL urlObj = new URL(url);
            String query = urlObj.getQuery();
            if (query != null) {
                String[] pairs = query.split("&");
                for (String pair : pairs) {
                    String[] keyValue = pair.split("=");
                    if (keyValue.length == 2) {
                        queryParams.put(URLDecoder.decode(keyValue[0], "UTF-8"), URLDecoder.decode(keyValue[1], "UTF-8"));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return queryParams;
    }
}

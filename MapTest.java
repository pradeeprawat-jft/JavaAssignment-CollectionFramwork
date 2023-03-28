import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>();
        mp.put("India", "delhi");
        mp.put("USA", "Washington");
        mp.put("Pakistan", "Islamabad");
        mp.put("Bangladesh", "dhaka");
        System.out.println(mp);
        for (String country : mp.keySet()) {
            String capital = mp.get(country);
            System.out.println(country + " -> " + capital);
        }

        System.out.println("\nTreeMap\n");

        Map<String, String> mp2 = new TreeMap<>();
        mp2.putAll(mp);
        for (String country : mp2.keySet()) {
            String capital = mp2.get(country);
            System.out.println(country + " -> " + capital);
        }
    }
}

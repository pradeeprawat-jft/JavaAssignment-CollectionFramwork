import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> animal = new HashSet<>();
        animal.add("cat");
        animal.add("cat");
        animal.add("dog");
        animal.add("cow");
        animal.add("cow");
        animal.add("tiger");

        for (String element : animal) {
            System.out.print(element + " ");
        }
        System.out.println("\nTreeSet");
//        Set<String> newAnimal = new TreeSet<>(animal); //using Constructor

        Set<String> newAnimal = new TreeSet<>();
        newAnimal.addAll(animal);

        for (String element : newAnimal) {
            System.out.print(element + " ");
        }
    }
}

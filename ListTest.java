import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("cow");
        animal.add("tiger");

        animal.add(1, "camel");
        animal.add(3, "goat");

//        System.out.println(animal); Displaying List

        for (String element : animal) {
            System.out.print(element + " ");
        }
        System.out.println();

        if (animal.indexOf("tiger") != -1) {
            System.out.println("Camel is present");
        } else {
            System.out.println("Camel is not present");
        }
        System.out.println("Camel is removed from list " + animal.remove("camel"));
    }
}

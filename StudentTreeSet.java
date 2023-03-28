import java.util.TreeSet;

public class StudentTreeSet {

    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();
        treeSet.add(new Student("pradeep", "CSE", 23));
        treeSet.add(new Student("pradeep", "CSE", 34));
        treeSet.add(new Student("kamal", "CSE", 24));
        treeSet.add(new Student("mukesh", "BCA", 21));
        treeSet.add(new Student("vivek", "MCA", 25));
        System.out.println("TreeSet");
        treeSet.stream().forEach(s -> s.display());


        Student obj = new Student("pradeep", "CSE", 23);
        if (treeSet.contains(obj)) {
            System.out.println(obj);
        } else {
            System.out.println("not found");

        }
    }
}

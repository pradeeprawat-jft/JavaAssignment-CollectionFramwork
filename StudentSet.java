import java.util.HashSet;

public class StudentSet {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("pradeep", "CSE", 23));
        set.add(new Student("kamal", "CSE", 24));
        set.add(new Student("mukesh", "BCA", 21));
        set.add(new Student("vivek", "MCA", 25));
        set.stream().forEach(s -> s.display());

        System.out.println(" ");

        Student searchStudent = new Student("pradeep", "CSE", 23);
        if (set.contains(searchStudent)) {
            System.out.println("found pradeep,CSE,23");
        } else {
            System.out.println("not found");
        }
    }
}
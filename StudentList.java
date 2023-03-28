import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("pradeep", "CSE", 23));
        list.add(new Student("pradeep", "CSE", 23));
        list.add(new Student("kamal", "CSE", 24));
        list.add(new Student("mukesh", "BCA", 21));
        list.add(new Student("vivek", "MCA", 25));
        list.stream().forEach(s -> s.display());

        System.out.println(" ");

        Student obj = new Student("pradeep", "CSE", 23);
        if (list.contains(obj)) {
            System.out.println(obj);
        } else {
            System.out.println("not found");
        }
    }
}

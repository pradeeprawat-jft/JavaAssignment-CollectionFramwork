class Student implements Comparable<Student> {
    int age;
    String name;
    String course;

    public Student(String name, String course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }

    void display() {
        System.out.println("Name is " + name);
        System.out.println("Course is " + course);
        System.out.println("Age is " + age);
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || (getClass() != obj.getClass())) return false;
        Student stu = (Student) obj;
        return (this.course.equals(stu.course) && (this.name.equals(stu.name)) && (this.age == stu.age));
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age + this.course.hashCode();
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.age, this.age);
    }

    public String toString() {
        return "Name : " + this.name + " course : " + this.course + " Age : " + this.age;
    }
}
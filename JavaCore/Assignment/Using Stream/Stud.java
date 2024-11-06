import java.util.ArrayList;
import java.util.Collection;

record Info(String name, String div) {}

record Student(String id, double fees, int rating) implements Comparable<Student> {

    public int compareTo(Student that) {
        return id.compareTo(that.id);
    }
}

class Stud {

    public static Info[] getInfos()
    {
        return new Info[]{
            new Info("RUTURAJ", "A"),
            new Info("SUSH", "B"),
            new Info("PRIYA", "D"),
            new Info("DIYA", "A"),
            new Info("KRUTARTH", "B"),
            new Info("MANISH", "D"),
            new Info("PRAPTI", "A"),
            new Info("NISHANT", "B")
        };
    }

    public static Collection<Student> getStudents()
    {
        var students = new ArrayList<Student>();
        students.add(new Student("Ruturaj", 106000, 3));
        students.add(new Student("Sushant", 90600, 2));
        students.add(new Student("Kruthart", 102000, 5));
        students.add(new Student("Nishant", 80220, 1));
        students.add(new Student("Priya", 10200, 4));
        students.add(new Student("Riya", 11000, 4));
        students.add(new Student("Prapti", 850000, 2));
        students.add(new Student("Kunal", 50000, 5));
        students.add(new Student("Manasi", 120010, 5));
        students.add(new Student("Manish", 45000, 3));
        return students;
    }



}
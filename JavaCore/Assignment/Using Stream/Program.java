import java.util.Arrays;
import java.util.Collection;

class Program {

    public static void main(String[] args) {
        if(args[0].equals("infos")){
            Info[] infos = Stud.getInfos();
            Arrays.stream(infos)
                .filter(i -> i.div().equals(args[1]))
                .map(i -> i.name())
                .forEach(System.out::println);
        }else if(args[0].equals("students")){
            double min = Double.parseDouble(args[1]);
            Collection<Student> students = Stud.getStudents();
            students.stream()
                .filter(c -> c.fees() >= min)
                .sorted((x, y) -> y.rating() - x.rating())
                .map(c -> String.format("%-16s%8s",
                    c.id().toUpperCase(),
                    "*".repeat(c.rating())
                ))
                .forEach(System.out::println);
        }
    }
}
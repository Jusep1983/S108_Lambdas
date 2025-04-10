package level3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainLvl3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Alice", 30, "JAVA", 2.1),
                new Student("Bob", 27, "PHP", 5.0),
                new Student("Charlie", 19, "JAVA", 7.3),
                new Student("David", 21, "PHP", 4.5),
                new Student("Eve", 53, "JAVA", 9.0),
                new Student("Frank", 41, "PHP", 3.2),
                new Student("Grace", 15, "JAVA", 6.5),
                new Student("Heidi", 22, "PHP", 7.0),
                new Student("Anna", 17, "JAVA", 4.9),
                new Student("Judy", 29, "PHP", 3.5)
        ));

        String namesAndAges = students.stream()
                .map(student -> student.getName() + " " + student.getAge())
                .collect(Collectors.joining(", ", "", ". "));
        System.out.println("List of students and ages:\n" + namesAndAges);

        List<Student> studentsWithA = ListManagement.getOnlyStudentsWithAFirst(students);
        System.out.println("\nList of students whose name begins with 'A': ");
        studentsWithA.forEach(System.out::println);

        System.out.println("\nList of approved students: ");
        ListManagement.getApprovedStudents(students).forEach(System.out::println);

        System.out.println("\nList of approved java students: ");
        ListManagement.getApprovedStudentsJava(students).forEach(System.out::println);

        System.out.println("\nList of Java students of legal age: ");
        ListManagement.javaStudentsOfLegalAge(students).forEach(System.out::println);

    }

}

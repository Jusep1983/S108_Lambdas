package level3;

import java.util.List;
import java.util.stream.Collectors;

public class ListManagement {

    public static List<Student> getOnlyStudentsWithAFirst(List<Student> students) {
        return students.stream()
                .filter(student -> student.getName().charAt(0) == 'A')
                .collect(Collectors.toList());
    }

    public static List<Student> getApprovedStudents(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGrade() >= 5)
                .collect(Collectors.toList());
    }

    public static List<Student> getApprovedStudentsJava(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGrade() >= 5 && !student.getCourse().equals("PHP"))
                .collect(Collectors.toList());
    }

    public static List<Student> javaStudentsOfLegalAge(List<Student> students) {
        return students.stream()
                .filter(student -> student.getAge() >= 18 && student.getCourse().equals("JAVA"))
                .collect(Collectors.toList());
    }

}

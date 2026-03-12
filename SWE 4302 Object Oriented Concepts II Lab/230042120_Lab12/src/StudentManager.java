import java.util.*;

public class StudentManager {
    public static void sortByGPA(List<Student> students) {
        students.sort(Comparator.comparingDouble(Student::getGpa));
    }

    public static Student searchById(List<Student> students, String id) {
        for(Student s: students) {
            if(s.getStudentId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public static Map<String, List<Student>> groupByGender(List<Student> students) {

        Map<String, List<Student>> grouped = new HashMap<>();

        for(Student s: students) {
            grouped.putIfAbsent(s.getGender(), new ArrayList<>());
            grouped.get(s.getGender()).add(s);
        }

        return grouped;
    }
}
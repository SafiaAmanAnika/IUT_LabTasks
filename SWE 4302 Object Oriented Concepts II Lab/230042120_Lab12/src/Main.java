import java.util.*;

public class Main {
    public static void main(String[] args) {

        Storage<Student> store = new Storage<>();

        // Add students
        store.add(new Student("S1", "Alice", 3.5, "Female"));
        store.add(new Student("S2", "Bob", 3.9, "Male"));
        store.add(new Student("S3", "Charlie", 3.2, "Male"));
        store.add(new Student("S4", "Diana", 3.8, "Female"));

        List<Student> students = store.getAll();

        //Sort by GPA
        StudentManager.sortByGPA(students);

        System.out.println("Students Sorted by GPA:");
        for(Student s: students) {
            System.out.println(s);
        }

        System.out.println();

        //Search Student
        Student found = StudentManager.searchById(students, "S2");

        System.out.println("Search Result:");
        if(found != null)
            System.out.println(found);
        else
            System.out.println("Student not found");

        System.out.println();

        //Group by Gender
        Map<String, List<Student>> grouped = StudentManager.groupByGender(students);

        System.out.println("Grouped by Gender:");

        for(String gender: grouped.keySet()) {

            System.out.println(gender + ":");

            for(Student s: grouped.get(gender)) {
                System.out.println("  " + s);
            }
        }
    }
}
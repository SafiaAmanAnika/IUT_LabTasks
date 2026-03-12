public class Student {
    private String studentId, name, gender;
    private double gpa;

    public Student(String studentId, String name, double gpa, String gender) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "ID: " + studentId +
               ", Name: " + name +
               ", GPA: " + gpa +
               ", Gender: " + gender;
    }
}
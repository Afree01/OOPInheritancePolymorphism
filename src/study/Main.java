package study;

public class Main {
    public static void main(String[] args) {
        Student[] studentList = new Student[3];

        studentList[0] = new Student(101, "Alice", "alice@school.com");
        studentList[1] = new GraduateStudent(202, "Bob", "bob@school.com", "Quantum Computing");
        studentList[2] = new Student(103, "Charlie", "charlie@school.com");

        System.out.println("\n//- University Roster //-");
        for (Student s : studentList) {
            s.displayInfo();
            System.out.println();
        }
    }
}
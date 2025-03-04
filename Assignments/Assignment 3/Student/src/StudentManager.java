// Name: Rupankar Das
// PRN: 23070126111
// Batch: 2023-27 AIML B2

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        this.students = new ArrayList<>();
    }

    // Add Student
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PRN: ");
        String prn = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter DOB (dd/mm/yyyy): ");
        String dob = sc.next();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            student.displayStudent();
        }
    }

    // Search by PRN
    public void searchByPRN(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                student.displayStudent();
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    // Search by Name
    public void searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.displayStudent();
                return;
            }
        }
        System.out.println("Student with Name " + name + " not found.");
    }

    // Search by Position
    public void searchByPosition(int index) {
        if (index < 0 || index >= students.size()) {
            System.out.println("Invalid position!");
            return;
        }
        students.get(index).displayStudent();
    }

    // Update Student
    public void updateStudent(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter new Name: ");
                student.setName(sc.next());
                System.out.print("Enter new DOB: ");
                student.setDob(sc.next());
                System.out.print("Enter new Marks: ");
                student.setMarks(sc.nextDouble());
                System.out.println("Student details updated.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    // Delete Student
    public void deleteStudent(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
}





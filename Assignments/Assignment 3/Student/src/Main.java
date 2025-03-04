// Name: Rupankar Das
// PRN: 23070126111
// Batch: 2023-27 AIML B2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter PRN to search: ");
                    manager.searchByPRN(sc.next());
                    break;
                case 4:
                    System.out.print("Enter Name to search: ");
                    manager.searchByName(sc.next());
                    break;
                case 5:
                    System.out.print("Enter Position to search: ");
                    manager.searchByPosition(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter PRN to update: ");
                    manager.updateStudent(sc.next());
                    break;
                case 7:
                    System.out.print("Enter PRN to delete: ");
                    manager.deleteStudent(sc.next());
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

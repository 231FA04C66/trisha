import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Details");
            System.out.println("3. Calculate Average Marks");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    scanner.nextLine();  // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter student roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter student marks: ");
                    double marks = scanner.nextDouble();
                    students.add(new Student(name, rollNumber, marks));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students added yet.");
                    } else {
                        System.out.print("Enter student roll number to view details: ");
                        int searchRollNumber = scanner.nextInt();
                        boolean found = false;
                        for (Student student : students) {
                            if (student.getRollNumber() == searchRollNumber) {
                                student.displayDetails();
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Student with roll number " + searchRollNumber + " not found.");
                        }
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No students to calculate average marks.");
                    } else {
                        double totalMarks = 0;
                        for (Student student : students) {
                            totalMarks += student.getMarks();
                        }
                        double averageMarks = totalMarks / students.size();
                        System.out.println("Average Marks of all students: " + averageMarks);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Student Management System!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

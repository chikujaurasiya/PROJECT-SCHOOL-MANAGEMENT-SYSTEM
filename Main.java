 import java.util.ArrayList;
import java.util.Scanner;

// Student class
class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

// Teacher class
class Teacher {
    private int id;
    private String name;
    private String subject;

    public Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Subject: " + subject;
    }
}

// Main School Management System class
public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    viewStudents();
                    break;
                case 4:
                    viewTeachers();
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 5);
    }

    private static void showMenu() {
        System.out.println("\n--- School Management System ---");
        System.out.println("1. Add Student");
        System.out.println("2. Add Teacher");
        System.out.println("3. View Students");
        System.out.println("4. View Teachers");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(id, name, age, grade);
        students.add(student);

        System.out.println("Student added successfully!");
    }

    private static void addTeacher() {
        System.out.print("Enter Teacher ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Teacher Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, subject);
        teachers.add(teacher);

        System.out.println("Teacher added successfully!");
    }

    private static void viewStudents() {
        System.out.println("\n--- List of Students ---");
        if (students.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private static void viewTeachers() {
        System.out.println("\n--- List of Teachers ---");
        if (teachers.isEmpty()) {
            System.out.println("No teachers registered.");
        } else {
            for (Teacher t : teachers) {
                System.out.println(t);
            }
        }
    }
}

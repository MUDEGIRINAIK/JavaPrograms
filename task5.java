import java.io.*;
import java.util.*;
public class task5{
    public static class Student {
        private String name;
        private int rollNumber;
        private String grade;
        private String address;
        public Student(String name, int rollNumber, String grade, String address) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
            this.address = address;
        }
        public String getName() {
            return name;
        }
        public int getRollNumber() {
            return rollNumber;
        }
        public String getGrade() {
            return grade;
        }
        public String getAddress() {
            return address;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }
        public void setGrade(String grade) {
            this.grade = grade;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNumber=" + rollNumber +
                    ", grade='" + grade + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
    private final List<Student> students;
    public task5() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public boolean removeStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }
    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }
    public List<Student> getAllStudents() {
        return students;
    }
    public void loadStudentsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                String name = details[0];
                int rollNumber = Integer.parseInt(details[1]);
                String grade = details[2];
                String address = details[3];

                Student student = new Student(name, rollNumber, grade, address);
                addStudent(student);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while loading students from file: " + e.getMessage());
        }
    }
    public void saveStudentsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student student : students) {
                writer.write(student.getName() + "," + student.getRollNumber() + "," + student.getGrade() + "," + student.getAddress());
                writer.newLine();
            }
            System.out.println("Students saved successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving students to file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        task5 system = new task5();
        Scanner scanner = new Scanner(System.in);
        system.loadStudentsFromFile();
        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add a new student");
            System.out.println("2. Edit an existing student");
            System.out.println("3. Search for a student");
            System.out.println("4. Display all students");
            System.out.println("5. Remove a student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addStudentUI(system, scanner);
                    break;
                case 2:
                    editStudentUI(system, scanner);
                    break;
                case 3:
                    searchStudentUI(system, scanner);
                    break;
                case 4:
                    displayAllStudentsUI(system);
                    break;
                case 5:
                    removeStudentUI(system, scanner);
                    break;
                case 6:
                    system.saveStudentsToFile();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    private static void addStudentUI(task5 system, Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        if (name.isEmpty() || grade.isEmpty() || address.isEmpty()) {
            System.out.println("All fields are required.");
            return;
        }
        Student student = new Student(name, rollNumber, grade, address);
        system.addStudent(student);
        System.out.println("Student added successfully!");
    }
    private static void editStudentUI(task5 system, Scanner scanner) {
        System.out.print("Enter roll number of the student to edit: ");
        int rollNumber = Integer.parseInt(scanner.nextLine());
        Student student = system.searchStudent(rollNumber);
        if (student != null) {
            System.out.print("Enter new name (leave blank to keep current): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                student.setName(name);
            }
            System.out.print("Enter new grade (leave blank to keep current): ");
            String grade = scanner.nextLine();
            if (!grade.isEmpty()) {
                student.setGrade(grade);
            }
            System.out.print("Enter new address (leave blank to keep current): ");
            String address = scanner.nextLine();
            if (!address.isEmpty()) {
                student.setAddress(address);
            }
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }
    private static void searchStudentUI(task5 system, Scanner scanner) {
        System.out.print("Enter roll number of the student to search: ");
        int rollNumber = Integer.parseInt(scanner.nextLine());
        Student student = system.searchStudent(rollNumber);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found!");
        }
    }
    private static void displayAllStudentsUI(task5 system) {
        for (Student student : system.getAllStudents()) {
            System.out.println(student);
        }
    }
    private static void removeStudentUI(task5 system, Scanner scanner) {
        System.out.print("Enter roll number of the student to remove: ");
        int rollNumber = Integer.parseInt(scanner.nextLine());

        if (system.removeStudent(rollNumber)) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }
}
public class Student {
    // Student details (fields)
    String name;
    int age;
    int marks;

    // Constructor to initialize student details
    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Marks: " + marks);
    }

    // Main method to create object and display details
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Raj", 20, 85);

        // Display student details using the object
        student1.displayDetails();
    }
}

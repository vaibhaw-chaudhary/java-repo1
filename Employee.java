public class Employee {
    // Static variable shared by all instances
    static String companyName = "TechCorp";
    
    // Instance variables
    String name;
    int id;
    
    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Company: " + companyName);
    }
    
    public static void main(String[] args) {
        // Create employee objects
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        
        // Display initial details
        System.out.println("Initial Employee Details:");
        emp1.display();
        emp2.display();
        
        // Change the shared company name
        Employee.companyName = "NewTech";
        
        System.out.println("\nAfter changing company name:");
        emp1.display();
        emp2.display();
    }
}
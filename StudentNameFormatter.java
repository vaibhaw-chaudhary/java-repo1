import java.util.Scanner;

public class StudentNameFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        
        System.out.println("\n1. Original Name: " + name);
        System.out.println("length of the name: " + name.length());
        System.out.println("2+. Upper Case: " + name.toUpperCase());
        System.out.println("3. Lower Case: " + name.toLowerCase());
        
        sc.close();
    }
}

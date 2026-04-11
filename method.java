   
    
    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    // Method to divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
    
    // Method to find modulus (remainder)
    public static int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot perform modulus with zero!");
            return 0;
        }
        return a % b;
    }
    
    // Method to find power
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }
    
    // Method to find square root
    public static double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot find square root of negative number!");
            return 0;
        }
        return Math.sqrt(a);
    }
    
    // Main method to test all operations
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println();
        
        System.out.println("1. Addition: " + num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println("2. Subtraction: " + num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println("3. Multiplication: " + num1 + " × " + num2 + " = " + multiply(num1, num2));
        System.out.println("4. Division: " + num1 + " ÷ " + num2 + " = " + divide(num1, num2));
        System.out.println("5. Modulus: " + num1 + " % " + num2 + " = " + modulus(num1, num2));
        System.out.println("6. Power: " + num1 + " ^ " + num2 + " = " + power(num1, num2));
        System.out.println("7. Square Root: √" + num1 + " = " + squareRoot(num1));
    }


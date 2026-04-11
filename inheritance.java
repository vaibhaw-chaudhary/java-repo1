public class inheritance {
    // Parent class
    static class Animal {
        void eat() {
            System.out.println("Animal eats");
        }
    }

    // Child class inheriting from Animal
    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from parent class
        dog.bark(); // Own method
    }
}

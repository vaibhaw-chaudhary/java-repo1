public class instantvariable {
    int instanceVar = 0; // instance variable

    public void showDifference() {
        int localVar = 0; // local variable
        instanceVar++;
        localVar++;
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        instantvariable obj = new instantvariable();
        obj.showDifference();
        obj.showDifference();
        obj.showDifference();
    }
}

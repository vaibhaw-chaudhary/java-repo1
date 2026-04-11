public class privatevariable {
    private String name; // private instance variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        privatevariable obj = new privatevariable();
        obj.setName("John Doe");
        System.out.println("Name: " + obj.getName());
    }
}

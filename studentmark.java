public class studentmark {
    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 88, 95 ,81 ,76 ,90 ,89 ,94};
        for(int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i+1) + ": " + marks[i]);
        }
    }
}
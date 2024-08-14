import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[10];
        int total = 0;
        
        // Getting input for 10 marks
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        
        // Displaying the result
        System.out.println("Total marks: " + total);
    }
}

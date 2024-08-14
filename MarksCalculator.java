import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        String input = System.getenv("MARKS_INPUT");
        if (input == null || input.isEmpty()) {
            System.out.println("No input provided.");
            return;
        }

        String[] marksArray = input.split(",");
        int total = 0;

        // Check if we have 10 marks
        if (marksArray.length != 10) {
            System.out.println("Please provide exactly 10 marks.");
            return;
        }

        // Calculate the total
        for (int i = 0; i < 10; i++) {
            total += Integer.parseInt(marksArray[i]);
        }

        // Display the result
        System.out.println("Total marks: " + total);
    }
}

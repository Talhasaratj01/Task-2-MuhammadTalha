import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = 0;
        while (true) {
            System.out.print("Enter number of subjects: ");
            try {
                subjects = sc.nextInt();
                sc.nextLine(); // consume newline to avoid buffer trap
                if (subjects > 0) break;
                System.out.println("Please enter a positive integer greater than 0.");
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        int total = 0;
        for (int i = 1; i <= subjects; i++) {
            int mark = -1;
            while (true) {
                System.out.print("Enter marks for subject " + i + " (0-100): ");
                try {
                    mark = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (mark >= 0 && mark <= 100) break;
                    System.out.println("Marks must be between 0 and 100. Try again.");
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("Invalid input. Please enter an integer between 0 and 100.");
                }
            }
            total += mark;
        }

        double avg = (double) total / subjects; // average percentage per subject

        String grade;
        if (avg >= 90) grade = "A";
        else if (avg >= 80) grade = "B";
        else if (avg >= 70) grade = "C";
        else if (avg >= 60) grade = "D";
        else grade = "F";

        System.out.println();
        System.out.println("Results:");
        System.out.println("Total Marks: " + total + " / " + (subjects * 100));
        System.out.printf("Average: %.2f%%\n", avg);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

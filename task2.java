import java.util.InputMismatchException;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjects = 0;
        int total = 0;
        double average;
        String grade;
        while (true) {
            try {
                System.out.print("Enter number of subjects: ");
                subjects = sc.nextInt();

                if (subjects <= 0) {
                    System.out.println("Number of subjects must be greater than 0.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter a valid number.");
                sc.next();
            }
        }
        for (int i = 1; i <= subjects; i++) {
            while (true) {
                try {
                    System.out.print("Enter marks of Subject " + i + " (0-100): ");
                    int marks = sc.nextInt();
                    if (marks < 0 || marks > 100) {
                        System.out.println("Marks must be between 0 and 100.");
                        continue;
                    }
                    total += marks;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Enter numbers only.");
                    sc.next();
                }
            }
        }
        average = (double) total / subjects;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks : " + total);
        System.out.printf("Average Percentage : %.2f%%\n", average);
        System.out.println("Grade : " + grade);
    }
}
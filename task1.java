import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        System.out.println("===== NUMBER GAME =====");
        System.out.println("Guess a number between 1 and 100");
        while (guess != randomNumber) {
            try {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;
                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter number between 1 and 100.");
                }
                else if (guess > randomNumber) {
                    System.out.println("Your guess is Too High!");
                }
                else if (guess < randomNumber) {
                    System.out.println("Your guess is Too Low!");
                }
                else {
                    System.out.println();
                    System.out.println("Congratulations!");
                    System.out.println("You guessed the correct number.");
                    System.out.println("Attempts = " + attempts);
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next();
            }
        }
    }
}
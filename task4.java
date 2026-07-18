import java.util.InputMismatchException;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            try {
                System.out.println("\n===== Currency Converter =====");
                System.out.println("1. Convert Currency");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("\nCurrencies");
                    System.out.println("1. INR");
                    System.out.println("2. USD");
                    System.out.println("3. EUR");
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Amount must be greater than zero.");
                        continue;
                    }
                    System.out.print("From Currency (1-3): ");
                    int from = sc.nextInt();
                    System.out.print("To Currency (1-3): ");
                    int to = sc.nextInt();
                    double inr = 0;
                    switch (from) {
                        case 1:
                            inr = amount;
                            break;
                        case 2:
                            inr = amount * 83;     // 1 USD = 83 INR
                            break;
                        case 3:
                            inr = amount * 90;     // 1 EUR = 90 INR
                            break;
                        default:
                            System.out.println("Invalid source currency.");
                            continue;
                    }
                    double result = 0;
                    switch (to) {
                        case 1:
                            result = inr;
                            System.out.printf("Converted Amount = %.2f INR\n", result);
                            break;
                        case 2:
                            result = inr / 83;
                            System.out.printf("Converted Amount = %.2f USD\n", result);
                            break;
                        case 3:
                            result = inr / 90;
                            System.out.printf("Converted Amount = %.2f EUR\n", result);
                            break;
                        default:
                            System.out.println("Invalid target currency.");
                    }
                }
                else if (choice == 2) {
                    System.out.println("Thank You!");
                }
                else {
                    System.out.println("Invalid Choice.");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid Input! Please enter numbers only.");
                sc.next();
                choice = 0;
            }
        } while (choice != 2);
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        }
        else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance : ₹" + balance);
    }
}
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(10000);
        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            try {
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double deposit = sc.nextDouble();
                        account.deposit(deposit);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdraw = sc.nextDouble();
                        account.withdraw(withdraw);
                        break;
                    case 3:
                        account.checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using ATM.");
                        break;
                    default:
                        System.out.println("Invalid Choice.");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid Input! Numbers only.");
                sc.next();
                choice = 0;
            }
        } while (choice != 4);
    }
}

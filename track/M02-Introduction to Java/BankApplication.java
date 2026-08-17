import java.util.Scanner;

class Bank {
    String bankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;

    Bank(String bankName, int userId, String userName, long accountNumber, String accountType, double balance) {
        this.bankName = bankName;
        this.userId = userId;
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void displayBankDetails() {
        System.out.println("Bank name: " + bankName);
    }

    void displayUserDetails() {
        System.out.println("User Id: " + userId);
        System.out.println("User name: " + userName);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    String accountSummary() {
        String accountSummary = "Bank name: " + bankName + "\nUser name: " + userName + "\nAccount Number: "
                + accountNumber + "\nAccount Type: " + accountType + "\nBalance: " + balance;
        return accountSummary;
    }

    boolean hasMinimumBalance(double minimumBalance) {
        boolean res = false;
        if (balance >= minimumBalance) {
            res = true;
        }
        return res;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bank name: ");
        String bankName = scanner.nextLine();
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter account type: ");
        String accountType = scanner.nextLine();
        System.out.print("Enter opening balance: ");
        double openingBalance = scanner.nextDouble();

        Bank b = new Bank(bankName, userId, userName, accountNumber, accountType, openingBalance);
        b.displayBankDetails();
        b.displayUserDetails();
        b.displayAccountDetails();

        String summary = b.accountSummary();
        System.out.println("Account summary: \n" + summary);

        System.out.print("\nEnter minimum balance: ");
        double minimumBalance = scanner.nextDouble();

        boolean res = b.hasMinimumBalance(minimumBalance);
        if (res) {
            System.out.println("Minimum balance is maintained.");
        } else {
            System.out.println("Minimum balance is not maintained.");
        }
        scanner.close();
    }
}
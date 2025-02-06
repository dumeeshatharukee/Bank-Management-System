import java.util.Scanner;

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Management System");
        System.out.print("Enter Account Holder's Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = scanner.nextLong();

        System.out.print("Enter Initial Deposit Amount: ");
        double initialDeposit = scanner.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, initialDeposit);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.displayBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter recipient's Account Number: ");
                    long recipientAccountNumber = scanner.nextLong();

                    
                    BankAccount recipient = new BankAccount("Recipient", recipientAccountNumber, 0);
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    account.transfer(recipient, transferAmount);
                    break;

                case 5:
                    System.out.println("Thank you for interacting with the Bank Management System.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

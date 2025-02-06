public class BankAccountTest {
    public static void main(String[] args) {
        // Creating a BankAccount instance for testing
        BankAccount account = new BankAccount("Nimal Gamage", 1234567890L, 1000.00);

        // Display initial balance
        System.out.println("Initial Balance: ");
        account.displayBalance();

        // Test deposit
        System.out.println("\nDepositing Rs.500...");
        account.deposit(500.00);
        account.displayBalance();

        // Test withdraw
        System.out.println("\nWithdrawing Rs.200...");
        account.withdraw(200.00);
        account.displayBalance();

        // Test transfer
        BankAccount recipient = new BankAccount("Dumee Gamage", 9876543210L, 0);
        System.out.println("\nTransferring Rs.300 to Dumee Gamage's account...");
        account.transfer(recipient, 300.00);
        account.displayBalance();
        recipient.displayBalance();
    }
}

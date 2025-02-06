public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
            System.out.println("Transferred: " + amount + " to Account: " + recipient.getAccountNumber());
        } else {
            System.out.println("Transfer failed. Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}

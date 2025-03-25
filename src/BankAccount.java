public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public BankAccount(String account, String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(String account) {
        accountNumber = "";
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Add" + amount + "to account number: " + accountNumber);
        } else {
            System.out.println("amount is invalid");
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0) {
            if (amount > balance) {
                System.out.println("No enough balance");
            } else {
                balance -= amount;
                System.out.println("Add" + amount + "to account number: " + accountNumber);

            }
        } else {
            System.out.println("amount is invalid");
        }

    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

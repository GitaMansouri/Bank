public class TransactionAccount extends BankAccount{
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountHolderName, String accountNumber, double initialBalance){
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public void calculateInterest() {
        System.out.println("No interest has exist");
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}

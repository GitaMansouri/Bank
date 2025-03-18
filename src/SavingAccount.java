public class SavingAccount extends BankAccount{
    private final double interestRate = 0.03;
    double initialBalance;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance){
        super(accountNumber,accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        deposit(interestRate * balance);
        System.out.println("Add profit" + interestRate * balance + " to account by Saving acoount");
    }


}

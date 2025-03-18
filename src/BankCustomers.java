import java.util.ArrayList;

public class BankCustomers extends BankAccount{
    private ArrayList<BankAccount> accountList;

    public BankCustomers(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public BankCustomers(String account) {
        super(account);
    }


    public void addAccount(BankAccount account){
        accountList.add(account);
    }

    public ArrayList<BankAccount> setAccountList() {
        return accountList;
    }

    public BankAccount showAllBalances(){
        System.out.println("Account owner: " + getAccountHolderName());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        return null;
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return showAllBalances();
            }
        }
        System.out.println("Account with number " + accountNumber + "not found");
        return null;
    }

    @Override
    public void calculateInterest() {

    }
}

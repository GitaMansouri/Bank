
public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        TransactionAccount transactionAccount1 = new TransactionAccount("T001", "Gita", 1000.0);
        TransactionAccount transactionAccount2 = new TransactionAccount("T002", "Niloofar", 2000.0);
        TransactionAccount transactionAccount3 = new TransactionAccount("T003", "Mohammad", 1500.0);

        SavingAccount savingAccount1 = new SavingAccount("S001", "Moghagn", 5000.0);
        SavingAccount savingAccount2 = new SavingAccount("S002", "Arash", 3000.0);
        SavingAccount savingAccount3 = new SavingAccount("S003", "Pedram", 4000.0);

        bank.addAccount(transactionAccount1);
        bank.addAccount(transactionAccount2);
        bank.addAccount(transactionAccount3);
        bank.addAccount(savingAccount1);
        bank.addAccount(savingAccount2);
        bank.addAccount(savingAccount3);

        BankAccount foundAccount = bank.findAccount("T001");
        BankAccount notFoundAccount = bank.findAccount("T999");

        if (foundAccount != null) {
            System.out.println("Balance " + foundAccount.getAccountNumber() + "is: " + foundAccount.getBalance());
        }

        transactionAccount1.deposit(567);
        System.out.println("Updated balace " + transactionAccount1.getAccountNumber() + "is: " + transactionAccount1.getBalance());
        transactionAccount2.deposit(-138);

        savingAccount1.calculateInterest();
        transactionAccount1.calculateInterest();

        transactionAccount1.withdraw(347);
        transactionAccount1.withdraw(-143);
        transactionAccount2.withdraw(2890);

        savingAccount1.withdraw(586);
        savingAccount1.withdraw(-57);
        savingAccount2.withdraw(3522);


        System.out.println("\nAccount's print:\n");
        bank.showAllBalances(transactionAccount1);
        bank.showAllBalances(transactionAccount2);
        bank.showAllBalances(transactionAccount3);

        bank.showAllBalances(savingAccount1);
        bank.showAllBalances(savingAccount2);
        bank.showAllBalances(savingAccount3);

    }
}

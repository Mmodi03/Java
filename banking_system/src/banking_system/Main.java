package banking_system;

public class Main {

	public static void main(String[] args) {
        Bank.incrementTotalAccounts();
        Bank.incrementTotalAccounts();
        Bank.incrementTotalAccounts();
        System.out.println("Total Accounts: " + Bank.getTotalAccounts());

        SavingAccount s = new SavingAccount();
        s.deposit(1000);
        s.withdraw(500);
        System.out.println("Savings Account Balance: " + s.getBalance());

        CheckingAccount c = new CheckingAccount();
        c.deposit(2000);
        c.withdraw(1000);
        System.out.println("Checking Account Balance: " + c.getBalance());

        Transaction transaction = new Transaction();
        transaction.performTransaction(s, 200);
        transaction.performTransaction(c, 500);
	}

}

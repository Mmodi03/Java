package banking_system;

public class Transaction {
	private final double transactionFee = 1.0;

    public final void performTransaction(Account account, double amount) {
        if (amount <= account.getBalance()) {
            account.withdraw(amount + transactionFee); 
            System.out.println("Transaction Successful!");
        } else {
            System.out.println("Insufficient funds for the transaction!");
        }
    }
}

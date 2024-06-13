package banksynchronizationprog.ex.io;

public interface Bank {
	int MINBAL=5000;
	static final int DAILY_LIMIT=25000;
	public abstract void deposite(int amt) 	throws DepositLimitExceedsException;
	void withdraw(int amt)throws InsufficientBalanceException;
}

package banksynchronizationprog.ex.io;

public class DepositLimitExceedsException extends Exception{
	
	public DepositLimitExceedsException()
	{
		super("Daily Limit Of Deposite is Exceeds.");
	}
	
	public DepositLimitExceedsException(String msg)
	{
		super(msg);
	}
}

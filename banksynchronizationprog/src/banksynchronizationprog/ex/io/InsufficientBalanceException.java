package banksynchronizationprog.ex.io;

public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException()
	{
		super("Insufficient Balance in your Account.");
	}
	
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}

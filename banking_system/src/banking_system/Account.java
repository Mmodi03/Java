package banking_system;

abstract class Account {
	public double balance;
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
	
	public abstract void withdraw(double amount);
	
	public double getBalance()
	{
		return balance;
	}
}

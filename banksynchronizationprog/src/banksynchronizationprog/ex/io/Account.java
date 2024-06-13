package banksynchronizationprog.ex.io;

public class Account implements Bank{
	private int accno;
	private String name;
	private double balance;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}

	public Account(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	@Override
	public synchronized void deposite(int amt)throws DepositLimitExceedsException
	{
		if(amt>25000)
			throw new DepositLimitExceedsException("Daily Limit Exceeds...");
		else
			balance+=amt;
			System.out.println("Amount Deposited..."+amt);
	}
	
	@Override
	public synchronized void withdraw(int amt)throws InsufficientBalanceException
	{
		if(balance-amt<MINBAL)
			throw new InsufficientBalanceException();
		else
			balance=balance-amt;
			System.out.println("After Withdrwing rs."+amt+", Current Balance :rs."+balance);
	}
}

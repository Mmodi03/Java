package banking_system;

public class Bank {
	private static double totalAccounts=0;
	
	public static double getTotalAccounts()
	{
		return totalAccounts;
	}
	
	public static void incrementTotalAccounts()
	{
		totalAccounts++;
	}
}

package banking_system;

public class CheckingAccount extends Account{
	 @Override
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds!");
	        }
	    }
}

package banksynchronizationprog.ex.io;

public class Synchronization {

	public static void main(String[] args) {
		Account a=new Account(38,"Maitri",1100000);
		System.out.println(a);
		
		AccountThread thread[]=new AccountThread[5];
		for(int i=0;i<5;i++)
		{
			thread[i]=new AccountThread(a,1000*(i+1));
			try
			{
				thread[i].join();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println(a);
	}

}

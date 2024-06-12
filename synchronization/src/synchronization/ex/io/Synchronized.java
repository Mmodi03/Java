package synchronization.ex.io;

class Counter
{
	private int count;
	 
	public synchronized void increment()
	{
		count=count+1;
	}
	
	public int getCount()
	{
		return count;
	}
}
public class Synchronized {
	
	public static void main(String[] args)throws InterruptedException
	{
		Counter c=new Counter();
		Thread t=new Thread(()->{for(int i=0;i<20;i++)
			{
			c.increment();
			}});
		Thread t1=new Thread(()->{for(int i=0;i<20;i++)
		{
		c.increment();
		}});
		t.start();
		t1.start();
		t.join();
		t1.join();
		System.out.println(c.getCount());
	}
}

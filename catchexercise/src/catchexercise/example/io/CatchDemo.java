package catchexercise.example.io;

public class CatchDemo {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/5;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithemetic Exception Caught: "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Caught: "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught: "+e.getMessage());
		}
	}

}

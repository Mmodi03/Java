package example.covarient.io;

public class Dog extends Animal{
	public Dog getAnimal()
	{
		return this;
	}
	public void sound()
	{
		System.out.println("Bark");
	}
}

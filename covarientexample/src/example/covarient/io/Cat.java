package example.covarient.io;

public class Cat extends Animal{
	public Cat getAnimal()
	{
		return this;
	}
	public void sound()
	{
		System.out.println("Meow");
	}
}

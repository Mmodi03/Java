package example.covarient.io;

public class main {

	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d=new Dog();
		Cat c=new Cat();
		
//		a.sound();
//		d.sound();
//		c.sound();
		
		Animal a1=a.getAnimal();
		a1.sound();
		Dog d1=d.getAnimal();
		d1.sound();
		Cat c1=c.getAnimal();
		c1.sound();
	}

}

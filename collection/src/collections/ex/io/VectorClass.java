package collections.ex.io;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args)
	{
	Vector<String>animals=new Vector<>();
	animals.add("Dog");
	animals.add("Cat");
	animals.add("Sloth");
	System.out.println("Initial Vector: "+animals);
	
	String ele=animals.get(2);
	System.out.println("element at index 2: "+ele);
	
	//using iterator
	Iterator<String> i = animals.iterator();
	System.out.println("Vactor: ");
	
	while(i.hasNext())
	{
		System.out.print(i.next());
		System.out.print(", ");
	}
	ele=animals.remove(1);
	System.out.println("removed ele: "+ele);
	System.out.println("new vector: "+animals);
	}
}

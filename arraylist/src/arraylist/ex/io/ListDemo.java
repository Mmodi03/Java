package arraylist.ex.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void main(String[] args)
	{
		List list1=new ArrayList();
		System.out.println("size: "+list1.size());
		System.out.println("is list empty: "+list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("hello");
		list1.add(56.78);
		list1.add(20);
		list1.add('A');
		list1.add(5,"hii");
		list1.add(10);
		System.out.println("List is: "+list1);
		
		System.out.println("is list contains 15?" +list1.contains(15));
		list1.remove(false);
		System.out.println("List is: "+list1);
		System.out.println("element at 5th location is: "+list1.get(5));
		System.out.println("element removed: "+list1.remove(list1.lastIndexOf(10)));//last occurance
		System.out.println("element removed: "+list1.remove(list1.indexOf(10)));//particular occurance
		
		System.out.println("List is: "+list1);
		
		/*Collections.sort(list1);
		System.out.println("List is: "+list1);*/
		
		list1.clear();
		System.out.println("List is: "+list1);
	}
}

package map.ex.io;

import java.util.*;

class Student
{
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> bookMap =new HashMap<String,Integer>();
		bookMap.put("Let Us C",320);
		bookMap.put("The Complete Reference C++",450);
		bookMap.put("The Complete Reference java",465);
		bookMap.put("Python Programming",599);
		bookMap.put("Application Development Using Spring Boot",600);
		
		System.out.println("Book Details Are:");
		
		System.out.println(bookMap);
		
		System.out.println("Traversing A HashMap");
		Set set=bookMap.entrySet();
		
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey()+":"+me.getValue());
			
		}
			HashMap<String,String> hm1=new HashMap<String,String>();
			hm1.put("ram","ram01@gmail.com");
			hm1.put("radha", null);
			hm1.put(null, "abc");
			hm1.put("harish", null);
			hm1.put(null, null);
			hm1.put("ravi", "ravi123@gmail.com");
			
			System.out.println("\nPerson HashMap with name and emailid:-");
			System.out.println(hm1);
			
			HashMap<Integer,Student> studentMap=new HashMap<Integer,Student>();
			studentMap.put(1001,new Student(1,"aniket",78));
			studentMap.put(1002,new Student(2,"Sumit",84));
			studentMap.put(1003,new Student(3,"amit",81));
			studentMap.put(1004,new Student(4,"ankit",72));
			studentMap.put(1005,new Student(5,"anil",78));
			
			System.out.println("\nStudent Details are: "+studentMap);
	}

}

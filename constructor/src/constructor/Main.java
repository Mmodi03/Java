package constructor;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("payal");
		System.out.println("Name of Stduent 1:"+s1.getName());
		System.out.println("Name of Stduent 2:"+s2.getName());
	}

}

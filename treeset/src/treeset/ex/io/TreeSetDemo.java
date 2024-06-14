package treeset.ex.io;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> courses=new TreeSet<>();
		courses.add("core java");
		courses.add("python");
		courses.add("c++");
		courses.add("javascript");
		courses.add("springboot");
		
		System.out.println("Courses Are: "+courses);
		
		//subset method:
		
		Set<String> coursesSubSet=courses.subSet("javascript", true, "springboot",true);
		System.out.println("Courses Subset Are: "+coursesSubSet);
		
	}

}

/*
output:
	Courses Are: [c++, core java, javascript, python, springboot]
	Courses Subset Are: [javascript, python, springboot]
*/

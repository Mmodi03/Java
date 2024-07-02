package map.ex.io;

import java.util.Comparator;
import java.util.TreeMap;

// Define the Student class implementing Comparable
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double per;

    public Student(int id, String name, double per) {
        this.id = id;
        this.name = name;
        this.per = per;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPer() {
        return per;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", per=" + per +
                '}';
    }
}

public class TreemapDemo {

    public static void main(String[] args) {

        // Sorted Map - sort on keys
        TreeMap<String, Integer> courses = new TreeMap<String, Integer>();
        courses.put("Core Java", 25);
        courses.put("Python", 30);
        courses.put("Hibernate", 6);
        courses.put("C++", 15);
        courses.put("Springboot", 15);
        courses.put("C++", 20);
        // courses.put(null,null); //RTE - null keys not allowed
        //courses.put("HTML", null); // Adding null values can cause NullPointerException

        System.out.println("Courses are : " + courses);

        // Adding user defined objects
        TreeMap<Student, String> students = new TreeMap<Student, String>();
        students.put(new Student(101, "Harshita", 67), "TY");
        students.put(new Student(102, "Sheetal", 72), "FY");
        students.put(new Student(104, "Pallavi", 71), "SY");
        students.put(new Student(103, "Anisha", 87), "BE");
        System.out.println("Students are: " + students);

        // Sort using Comparator object with Lambda Expression
        Comparator<Student> comp = (s2, s1) -> (int) (s1.getPer() - s2.getPer());

        TreeMap<Student, String> t = new TreeMap<>(comp);
        t.put(new Student(101, "Harshita", 67), "TY");
        t.put(new Student(102, "Sheetal", 72), "FY");
        t.put(new Student(104, "Pallavi", 71), "SY");
        t.put(new Student(103, "Anisha", 87), "BE");
        System.out.println("Sorted Students by percentage: " + t);
    }
}

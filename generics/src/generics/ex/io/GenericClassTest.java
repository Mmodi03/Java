package generics.ex.io;

// Generic class definition
class GenericClass<T> {
    private T data;

    public void set(T data) {
        this.data = data;
    }

    public T get() {
        return data;
    }
}

// Person class definition
class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class GenericClassTest {
    public static void main(String[] args) {
         // GenericClass with String type of data member
        GenericClass<String> stringObj = new GenericClass<String>();
        stringObj.set("Hello");
        System.out.println(stringObj.get());

         // GenericClass with Integer type of data member
        GenericClass<Integer> integerObj = new GenericClass<Integer>();
        integerObj.set(10);
        System.out.println(integerObj.get());
        
         // GenericClass with Person object of data member
        GenericClass<Person> personObj = new GenericClass<Person>();
        personObj.set(new Person("Ajay", "Chennai"));
        System.out.println(personObj.get());
    }
}

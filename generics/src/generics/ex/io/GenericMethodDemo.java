package generics.ex.io;

// Person class definition
class P {
    private String name;
    private String city;

    public P(String name, String city) {
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

// GenericMethod class definition
class GenericMethod {
    // Generic method to display array elements
    public <T> void displayArrayElements(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethod obj = new GenericMethod();
        Integer[] intarray = { 10, 20, 30, 40 };
        String[] str = { "java", "programming", "learning" };
        P[] p1 = new P[] {
            new P("Nitin", "Pune"),
            new P("Manoj", "Mumbai"),
            new P("Mayur", "Delhi")
        };
        
        // Display Integer Array 
        System.out.println("Displaying Integer Array:");
        obj.displayArrayElements(intarray);
        
        // Display String Array
        System.out.println("\nDisplaying String Array:");
        obj.displayArrayElements(str);
        
        // Display Person Array
        System.out.println("\nDisplaying Person Array:");
        obj.displayArrayElements(p1);
    }
}

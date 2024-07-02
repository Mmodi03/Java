package generics.ex.io;

// GenericConstructors class definition
class GenericConstructors {
    private double value;

    // Constructor accepting Number type
    <T extends Number> GenericConstructors(T value) {
        this.value = value.doubleValue();
    }

    // Method to show the value
    public void show() {
        System.out.println("Value: " + value);
    }
}

public class GenericConstructorsDemo {
    public static void main(String[] args) {
        System.out.println("Number to Double Conversion:");
        
        GenericConstructors obj = new GenericConstructors(10); // Integer
        obj.show();
        
        GenericConstructors objOne = new GenericConstructors(136.8F); // Float
        objOne.show();
        
    }
}

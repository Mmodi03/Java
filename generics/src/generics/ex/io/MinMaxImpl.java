package generics.ex.io;

// Define the MinMax interface
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// Implement the MinMax interface
public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
    T[] values;

    // Generic Constructor
    MinMaxImpl(T[] obj) {
        values = obj;
    }

    // Generic method to find the minimum value
    @Override
    public T min() {
        T o1 = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(o1) < 0)
                o1 = values[i];
        return o1;
    }

    // Generic method to find the maximum value
    @Override
    public T max() {
        T o1 = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(o1) > 0)
                o1 = values[i];
        return o1;
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 6, 2, 8, 6};
        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>(intArray);
        System.out.println("Min: " + intMinMax.min());
        System.out.println("Max: " + intMinMax.max());

        String[] strArray = {"apple", "orange", "banana", "pear"};
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>(strArray);
        System.out.println("Min: " + strMinMax.min());
        System.out.println("Max: " + strMinMax.max());
    }
}

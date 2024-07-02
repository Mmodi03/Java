package generics.ex.io;

import java.util.ArrayList;
import java.util.List;

// UpperBoundedWildCard class definition
class UpperBoundedWildCard {
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}

public class UpperBoundedWildCardDemo {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        // Passing Integer List
        System.out.println("sum = " + UpperBoundedWildCard.sumOfList(intList));

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(10.0);
        doubleList.add(20.0);
        doubleList.add(30.0);
        // Passing Double List
        System.out.println("sum = " + UpperBoundedWildCard.sumOfList(doubleList));
    }
}

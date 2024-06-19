package lambademo.ex.io;

import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaWithParameter {

	public static void main(String[] args) {
		Message m1=(name)->{
			System.out.println("Hello "+name);
		};
		m1.greet("Maitri");
		
		Cube c=(a)->{
			return(a*a*a);
		};
		System.out.println("Cube Of 5 is: "+c.calculate(5));
		
		Stream<Integer> stream=Stream.of(10,20,30,40,50,60);
		Function<Integer,Integer> sqr=(n)->n*n;
		stream.map(sqr).forEach(System.out::println);
		
		IsOdd i =(num)->num%2!=0?true:false;
		System.out.println("Is 11 Odd Number?: "+i.checkOdd(11));
		System.out.println("Is 8 Odd Number?: "+i.checkOdd(8));
		
	}

}

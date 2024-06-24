package streamapidemo.ex.io;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamapiDemo {

	public static void main(String[] args) {
		//create a stream from set of values
		Stream<Integer> stream=Stream.of(10,20,30,40,50,60,70);
		
		//counting the values
		System.out.println(stream.count());
		//stream.forEach(System.out::println);//printing stream value->another way
		
		//creating array
		Integer[] values=new Integer[] {10,20,30,13,10,11,12,13};
		//creating the stream from array
		stream=Arrays.stream(values);
		
		//map
		System.out.println("\nSquare of "+Arrays.toString(values)+"is as follows:");
		
		//1 way:
		//stream.map(num -> num*num).forEach(System.out::println);
		
		//2 way:
		stream=stream.map(n->n*n );
		stream.forEach(System.out::println);
		
		//limit
		System.out.println("\nfirst 2 elements are:");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//skip
		System.out.println("\nelements excepts first 4: ");
		Arrays.stream(values).skip(4).forEach(System.out::println);
		
		//distinct
		System.out.println("\ndistinct elements are: ");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		List<String> words=Arrays.asList("Hello ","Stream ","Learning");
		//words.add("Happy");immutable list
		
		//create a stram for the list
		
		//toUppercase
		//toLowercase
		//collect
		
		Stream<String> stream1=words.stream();
		System.out.println("\n"+words);
	}

}

//output:
//	
//	7
//
//	Square of [10, 20, 30, 13, 10, 11, 12, 13]is as follows:
//	100
//	400
//	900
//	169
//	100
//	121
//	144
//	169
//
//	first 2 elements are:
//	10
//	20
//
//	elements excepts first 4: 
//	10
//	11
//	12
//	13
//
//	distinct elements are: 
//	10
//	20
//	30
//	13
//	11
//	12
//
//	[Hello , Stream , Learning]


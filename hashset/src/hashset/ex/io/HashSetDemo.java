package hashset.ex.io;

import java.util.HashSet;

public class HashSetDemo {

	static void addElements(HashSet<Integer> numberHashSet)
	{
		numberHashSet.add(61);
		numberHashSet.add(20);
		numberHashSet.add(52);
		numberHashSet.add(44);
		numberHashSet.add(38);
		numberHashSet.add(71);
		
		System.out.println(numberHashSet.add(20));
	}
	public static void main(String[] args) {
		
		HashSet<Integer> numberHashSet=new HashSet<>();
		addElements(numberHashSet);
		
		HashSet<Integer> numberHashSet1=new HashSet<>();
		numberHashSet1.add(20);
		numberHashSet1.add(45);
		numberHashSet1.add(10);
		numberHashSet1.add(38);
		numberHashSet1.add(18);
		numberHashSet1.add(61);
		
		System.out.println("Set 1: "+numberHashSet);
		System.out.println("Set 2: "+numberHashSet1);
		
		HashSet<Integer> numberHashSet2=new HashSet<>();
		addElements(numberHashSet2);
		
		//union of two set
		numberHashSet2.addAll(numberHashSet1);
		System.out.println("resultant set: "+numberHashSet2);
		
		numberHashSet2.clear();
		addElements(numberHashSet2);
		
		numberHashSet2.removeAll(numberHashSet1);
		System.out.println(numberHashSet2);
	}

}

/*output:
	false
	Set 1: [20, 52, 38, 71, 44, 61]
	Set 2: [18, 20, 38, 10, 45, 61]
	false
	resultant set: [18, 20, 52, 38, 71, 10, 44, 61, 45]
	false
	[52, 71, 44]
*/
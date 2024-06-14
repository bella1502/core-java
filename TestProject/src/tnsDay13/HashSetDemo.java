package tnsDay13;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<>();
		set.add(29);
		set.add(45);
		set.add(20);
		set.add(50);
		set.add(40);
		System.out.println("First set: "+set);
		System.out.println(set.add(20));
		System.out.println(set);
		
		System.out.println("------------------------");
		HashSet<Integer> set1=new HashSet<>();
		set1.add(28);
		set1.add(29);
		set1.add(49);
		set1.add(25);
		set1.add(59);
		set1.add(43);
		set1.add(40);
		System.out.println("Second set: "+set1);
		System.out.println("------------------------");
		set.addAll(set1);
		System.out.println("First set: "+set);
		System.out.println("Second set: "+set1);
		System.out.println("------------------------");
		set.removeAll(set1);
		System.out.println("First set[SET Difference]: "+set);
		System.out.println("Second set: "+set1);
		
		System.out.println("------------------------");
		set.clear();
		set.add(29);
		set.add(45);
		set.add(20);
		set.add(50);
		set.add(40);
		System.out.println("First set: "+set);
		System.out.println("Second set: "+set1);
		
		System.out.println("------------------------");
		set.retainAll(set1);
		System.out.println("First set[Integration]: "+set);
		System.out.println("Second set: "+set1);
		System.out.println("------------------------");
	}

}

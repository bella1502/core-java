package tnsDay13;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tset=new TreeSet<>();
		tset.add("Java");
		tset.add("c++");
		tset.add("Python");
		tset.add("React");
		tset.add("C");
		tset.add("NodeJS");
		System.out.println(tset);
		System.out.println("First course: "+tset.first());
		System.out.println("Last course: "+tset.last());
		
		tset.remove("C");
		System.out.println(tset);
		
		tset.pollFirst();  //remove first
		System.out.println(tset);
		
		tset.pollLast();  //remove last
		System.out.println(tset);
		
		System.out.println("-------------------------------");
		Comparator<Employee> comp=(e1,e2)->e1.getName().compareTo(e2.getName());
		
		TreeSet<Employee> eset=new TreeSet<>(comp);
		
		eset.add(new Employee("kalpana","pune",120000));
		eset.add(new Employee("Rohan","goa",220000));
		eset.add(new Employee("Ram","punjab",125000));
		eset.add(new Employee("Neha","Kerala",250000));
		eset.add(new Employee("Om","UP",100000));
		eset.add(new Employee("Tejas","MP",150000));
		
		System.out.println("Employee Details : \n"+eset);
	}

}

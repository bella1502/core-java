package tnsDay13;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		System.out.println(arr);
		System.out.println("length of arraylist: "+arr.size());
		arr.add(50);
		arr.add(60);
		System.out.println("is 31 present? "+arr.contains(31));
		System.out.println("is 40 present? "+arr.contains(40));
		System.out.println("index of 30: "+arr.indexOf(30));
		
		Iterator<Integer> i=arr.iterator();
		System.out.println("---------------------------");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		arr.add(60);
	}
}

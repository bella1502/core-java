package tnsDay13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(new Integer(11));
		arr.add(20);
		arr.add(30);
		System.out.println(arr.add(40));  //add() return boolean that shows if insertion occur or not
		System.out.println(arr);
		System.out.println("length of arraylist: "+arr.size());
		
	
		arr.add(50);
		arr.add(60);
		arr.add(34);
		arr.add(45);
		System.out.println("is 31 present? "+arr.contains(31));
		System.out.println("is 40 present? "+arr.contains(40));
		System.out.println("index of 30: "+arr.indexOf(30));
		arr.add(20);
		
		System.out.println("last time 30 occur: "+arr.lastIndexOf(30));
		System.out.println("last time 20 occur: "+arr.lastIndexOf(20));
		System.out.println("Array List: "+arr);
		
		System.out.println("*********************************");
		
		arr.remove(3); //we pass index
		System.out.println("list after remove index(3): "+arr);
		arr.remove(arr.indexOf(30)); //used for passing values
		System.out.println("list after remove value 30: "+arr);
		arr.remove(Integer.valueOf(34));
		System.out.println("list after remove value 34: "+arr);
		Collections.sort(arr);   //sort array list in ascending
		System.out.println("list after sorting: "+arr); 
		
		
		Iterator i=arr.iterator();
		System.out.println("---------------------------");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
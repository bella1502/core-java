package tnsDay13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkesHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		lset.add(30);
		lset.add(40);
		lset.add(50);
		lset.add(10);
		lset.add(15);
		lset.add(22);
		System.out.println(lset);
		Iterator<Integer> i=lset.iterator();
		while(i.hasNext())
			System.out.print(i.next()+"\t");
		
	
		System.out.println("Size: "+lset.size());
		lset.remove(30);
		lset.remove(80);
		System.out.println(lset);
		
		System.out.println("---------------------------------");
		ArrayList<Integer> a=new ArrayList<>(lset);
		System.out.println(a);
		Collections.sort(a);
		System.out.println("After sorting: "+a);
		
		lset=new LinkedHashSet<Integer>(a );
		System.out.println(lset);
		
	}

}

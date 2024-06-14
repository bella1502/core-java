package tnsDay13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class HomogeneousList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<>();
		s.add("kalpana");
		s.add("neha");
		s.add("ram");
		s.add("lipi");
		s.add("bholi");
		//s.add(10);  gives compile time error
		System.out.println("String List: "+s);
		Collections.sort(s);
		System.out.println("String list after sorting: "+s);
		
		ArrayList<Person> plist=new ArrayList<Person>();
		plist.add(new Person("kalpana","bihar", 12235688L));
		plist.add(new Person("Rohan","pune",145235688L));
		plist.add(new Person("ram","goa", 775235688L));
		plist.add(new Person("tejas","kerala", 4422765238L));
		plist.add(new Person("om","up", 1887635688L));
		
		System.out.println("Person List: \n"+plist);
		System.out.println("----------------------------");
		Iterator<Person> i=plist.iterator();
		while(i.hasNext())
		{
			Person p=i.next();
			System.out.println("Person is: "+p);
			//i.remove();
		}
		
		System.out.println("-----------------------------");
		System.out.println(plist.size());
		Comparator<Person> comp=(p1,p2)->p1.getName().compareTo(p2.getName());
		Collections.sort(plist, comp);
		System.out.println("-----------Sorted Ascending Order Person List name------------");
		System.out.println(plist);
		
		comp=(p1,p2)->(int)(p2.getContactNo()-p1.getContactNo());
		Collections.sort(plist, comp);
		System.out.println("-----------Sorted Ascending Order Person List contact no.------------");
		System.out.println(plist);
		
	}

}

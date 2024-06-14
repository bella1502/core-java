package tnsDay13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(new Student("kalpana","bihar", 12235688L));
		slist.add(new Student("Rohan","pune",145235688L));
		slist.add(new Student("ram","goa", 775235688L));
		slist.add(new Student("tejas","kerala", 4422765238L));
		slist.add(new Student("om","up", 1887635688L));
		
		System.out.println("Student List: \n"+slist);
		System.out.println("----------------------------");
		Iterator<Student> i=slist.iterator();
		while(i.hasNext())
		{
			Student p=i.next();
			System.out.println("Student is: "+p);
			//i.remove();
		}
		
		Collections.sort(slist);
		System.out.println("\n-------------sorted student list---------------");
		System.out.println("\n"+slist);
	}

}

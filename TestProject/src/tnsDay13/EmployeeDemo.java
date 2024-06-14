package tnsDay13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> elist=new ArrayList<Employee>();
		elist.add(new Employee("kalpana","pune",120000));
		elist.add(new Employee("Ram","Bihar",100000));
		elist.add(new Employee("Bholi","goa",150000));
		elist.add(new Employee("mansi","cocan",200000));
		elist.add(new Employee("kalpana","pune",250000));
		
		System.out.println("Employee List: \n"+elist);
		System.out.println("----------------------------");
		Iterator<Employee> i=elist.iterator();
		while(i.hasNext())
		{
			Employee p=i.next();
			System.out.println("Employee is: "+p);
			//i.remove();
		}
		
		System.out.println("\n-------------sorted student list by name---------------");
		Collections.sort(elist,new SortByEmployeeName());
		System.out.println("Employee List: \n"+elist);
		
		System.out.println("\n-------------sorted student list by salary---------------");
		Collections.sort(elist,new SortByEmployeeSalary());
		System.out.println("Employee List: \n"+elist);
	}
	}


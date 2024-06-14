package tnsDay13;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cityList=new LinkedList<>();
		cityList.add("Pune");
		cityList.add("Bihar");
		cityList.add("Goa");
		System.out.println(cityList);
		System.out.println("-----------------------------");
		cityList.add(2,"Kerala");
		System.out.println(cityList);
		System.out.println("-----------------------------");
		cityList.add(3,"Mumbai");
		cityList.add(4,"Manipur");
		System.out.println(cityList);
		System.out.println("-----------------------------");
		System.out.println("First City: "+cityList.getFirst());
		System.out.println("last City: "+cityList.getLast());
		System.out.println("City at position 2: "+cityList.get(2));
		System.out.println("-----------------------------");
		System.out.println("remove City at index 2: "+cityList.remove(2));
		System.out.println(cityList);
		System.out.println("Mumbai city removed? "+cityList.remove("Mumbai"));
		System.out.println(cityList);
		System.out.println("Banglore city removed? "+cityList.remove("Banglore"));
		System.out.println("Remove First City: "+cityList.removeFirst());
		System.out.println("remove Lat City: "+cityList.removeLast());
		System.out.println(cityList);
		System.out.println("-----------------------------");
		cityList.removeAll(cityList);
		System.out.println(cityList);
		System.out.println(cityList.size());
		System.out.println("-----------------------------");
		cityList.add("Pune");
		cityList.add("Bihar");
		cityList.add("Goa");
		cityList.add(2,"Kerala");
		cityList.add(3,"Mumbai");
		cityList.add(4,"Manipur");
		cityList.add("Banglore");
		cityList.add("utter pradesh");
		System.out.println(cityList);
		System.out.println(cityList.size());
		
		ListIterator<String> i=cityList.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next().toUpperCase());
		}
		System.out.println("-----------------------------");
		
		i=cityList.listIterator();
		while(i.hasNext())
		{
			String city=i.next();
			if(city.equals("Bihar"))
				i.remove();
			if(city.equals("Goa"))
				i.set("Goa");
			if(city.equals("Kerala"))
				i.add("Jaipur");
		}
		System.out.println(cityList);
		System.out.println("-----------------------------");
		
		i=cityList.listIterator(cityList.size());
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

}

package tnsDay13;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(101,"kalpana");
		tmap.put(104,"bholi");
		tmap.put(106,"ram");
		tmap.put(102,"amar");
		tmap.put(105,"tejas");
		tmap.put(103,"amey");
		System.out.println(tmap);
		
		System.out.println("----------------------------");
		tmap.put(105,"rohan");
		System.out.println(tmap);
		/*if we use same key for different value then value get updated
		 * key must be unique
		 * value can be duplicate
		 * key must not null*/
		Set<Integer> keyset=tmap.keySet();
		System.out.println(keyset);
		
		Collection<String> valueset=tmap.values();
		System.out.println(valueset);
		
		System.out.println(tmap.get(105));
		System.out.println(tmap.get(103));
		
		Set<Entry<Integer,String>> persons=tmap.entrySet();
		Iterator<Entry<Integer,String>> p=persons.iterator();
		while(p.hasNext())
		{
			Map.Entry<Integer,String> entry=p.next();
			System.out.println(entry);
		}
		}

}

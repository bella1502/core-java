package tnsDay17;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	//generic method
	public <T> void display(T[] a)
	{
		for(T n:a)
		{
			System.out.println(n);
		}
	}
	
	//unbounded wildcard
	public void displayArray(List<?> a)
	{
		for(Object n:a)
		{
			System.out.println(n);
		}
	}
	
	//unbounded wildcard
		public void SumOfElemts(List<?> a)
		{
			for(Object n:a)
			{
				System.out.println(n);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericExample obj=new GenericExample();
		Integer[]a= {12,54,99,55,23};
		String []b= {"aa","ab","gg","wr","dw"};
		Float []c= {12.3f,64.5f,63f,99.6f,2.44f};
		obj.display(a);
		obj.display(b);
		obj.display(c);
		
		System.out.println("----integer list-----------");
		List<Integer> l=new ArrayList<Integer>();
		l.add(11);
		l.add(22);
		l.add(88);
		obj.displayArray(l);
		
		System.out.println("-----String list-----------");
		List<String> s=new ArrayList<String>();
		s.add("Bihar");
		s.add("Pune");
		s.add("Goa");
		obj.displayArray(s);
		
		System.out.println("-----Float list-----------");
		List<Float> f=new ArrayList<Float>();
		f.add(23.5f);
		f.add(99.6f);
		f.add(54.7f);
		obj.displayArray(f);
	}

}

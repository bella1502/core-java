package tnsDay15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class FuntionalInterfaceDemo {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"\t-------in main-----------");
		Runnable r=()->{
			for(int i=0;i<50;i++)
			{
				System.out.println(Thread.currentThread().getName()+"\tHello");
				try {
					Thread.sleep(500);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		};
		Thread t1=new Thread(r,"Thread1");
		Thread t2=new Thread(r,"Thread2");
		
		t1.start();
		t2.start();
		r=()->{
			int i=2;
			while(i<=100)
			{
				System.out.println(Thread.currentThread().getName());
				i+=2;
				try {
					Thread.sleep(300);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		};
		ArrayList <Integer> a=new ArrayList<>();
		a.add(30);
		a.add(40);
		a.add(10);
		a.add(20);
		a.add(80);
		a.add(50);
		a.add(45);
		System.out.println("------before sorting---------");
		System.out.println(a);
		System.out.println("-------after sorting in ascending-----------");
		Collections.sort(a);
		System.out.println(a);
		System.out.println("------after sorting in descending--------");
		Comparator<Integer> comp=(n1,n2)->n2-n1;
		Collections.sort(a,comp);
		System.out.println(a);
		
		
		System.out.println("\n******* for string comparison *******");
		ArrayList<String> s=new ArrayList<>();
		s.add("Kalpana");
		s.add("Neha");
		s.add("Lipi");
		s.add("Mansi");
		s.add("Jai");
		System.out.println("------before sorting---------");
		System.out.println(s);
		System.out.println("-------after sorting in ascending-----------");
		Collections.sort(s);
		System.out.println(s);
		System.out.println("------after sorting in descending--------");
		Comparator <String> scomp=(s1,s2)->s2.compareTo(s1);
		Collections.sort(s,scomp);
		System.out.println(s);
		
		System.out.println("\n******* for other class *******");
		ArrayList<Student> st=new ArrayList<>();
		st.add(new Student(10,"Kalpana",90,"comp"));
		st.add(new Student(25,"Lipi",65,"it"));
		st.add(new Student(13,"Neha",87,"mech"));
		st.add(new Student(19,"Jae",48,"comp"));
		st.add(new Student(11,"Jui",99,"aids"));
		st.add(new Student(9,"Mansi",50,"entc"));
		System.out.println("------before sorting---------");
		System.out.println(st);
		System.out.println("-------after sorting in ascending-----------");
		Comparator <Student> stcomp=(s1,s2)->s1.getName().compareTo(s2.getName());
		Collections.sort(st,stcomp);
		System.out.println(st);
		System.out.println("------after sorting in descending--------");
		Comparator <Student> stcomp1=(s1,s2)->s2.getName().compareTo(s1.getName());
		Collections.sort(st,stcomp1);
		System.out.println(st);
		*/
		//GreetInterface greet=(s)->"Hello "+s;
		GreetInterface greet=new Greet1();
		System.out.println(greet.sayHello("Students!"));
		
		//greet=(s)->"hi "+s+" How are you?";
		greet=new Greet2();
		System.out.println(greet.sayHello("Students!"));
	}

}
class Greet1 implements GreetInterface
{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello "+name;
	}
	
}
class Greet2 implements GreetInterface
{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hi "+name+" how are you?";
	}
	
}
package tnsDay9Runtime;

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj;
		
		obj=new ClassA();
		obj.setN(10);
		obj.show();
		
		//b cannot access all method only can access override when a object is used
		
		/*
		obj=new ClassB();
		obj.setN(20);
		obj.show();
		*/
		
		ClassB obj1=new ClassB();
		obj1.setName("Kalpana");
		obj1.show();
		
		Person p1=new Person("kalpana","bihar");
		System.out.println(p1);
		
		Student s1=new Student("kalpana","bihar",101,"computer");
		System.out.println(s1);
	}

}

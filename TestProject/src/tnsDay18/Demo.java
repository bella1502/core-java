package tnsDay18;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

public class Demo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("Hello");
		
		System.out.println("------------------------");
		
		AndroidSeries obj=new AndroidSeries("A23", 14);
		System.out.println(obj.model);
		System.out.println(obj.screensize);
		
		Class c=obj.getClass();
		System.out.println("----smarttv details-------");
		Annotation an=c.getAnnotation(SmartTV.class);
		
		SmartTV s1=(SmartTV) an;
		
		System.out.println(s1.os());
		System.out.println(s1.price());
	}

}

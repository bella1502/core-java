package tnsDay17;

import java.util.ArrayList;

public class GenericInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("JAVA");
		//list.add(123);    --give compilation error
		for (Object object :list)
		{
		//Below statement throws ClassCastException at run time
		String str = (String) object;
		//Type casting
		System.out.println(str);
		}
	}
}

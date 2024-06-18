package tnsDay14;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		System.out.println("string is: "+s);
		StringBuffer sb=new StringBuffer(s);
		//StringBuffer sb=new StringBuffer("Hello");
		
		System.out.println(sb);
		sb.append("! How are you?");
		System.out.println(sb);
		sb.replace(0, 5, "Hi");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		s=sb.toString();
		System.out.println("New String is: "+s);
	}

}

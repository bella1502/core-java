package tnsDay14;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello! how are you?";
		String s2="Hello";
		System.out.println("--------different string functions----------");
		System.out.println("length: "+s1.length());
		System.out.println("char at index 3: "+s1.charAt(3));
		System.out.println("check s1 contains s2: "+s1.contains(s2));
		System.out.println("index of are: "+s1.indexOf("are"));
		System.out.println("index of what: "+s1.indexOf("what"));       //give -1 bcz it is not present
		System.out.println("is s1 start with s2? "+s1.startsWith(s2));
		System.out.println("is s1 start with HELLO? "+s1.startsWith("HELLO"));
		System.out.println("is s1 ends with '?'? "+s1.endsWith("?"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(11,16));
		System.out.println(s1.isEmpty());
		System.out.println(s1.replace("Hello", "Hi"));
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		
		
		String[]words=s1.split(" ");
		for(String str:words)
			System.out.println(str);
		
		
	}

}

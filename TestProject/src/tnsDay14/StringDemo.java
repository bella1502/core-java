package tnsDay14;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";  //save in string pool of heap storage
		String s2="Hello";  //point the same memory of s1
		String s3=new String("Hello");   //save in heap storage directly
		
		System.out.println("s1==s2? "+(s1==s2));  //true have same memory
		System.out.println("s1==s3? "+(s1==s3));  //false not same memory
		System.out.println("s1.equals(s3)? "+s1.equals(s3)); //true bcz content is same
		
		String s4=s1;
		String s5=s3;
		String s6=new String(s3);
		String s7=s3.intern();
		
		System.out.println("s1==s4? "+(s1==s4));  //true have same memory
		System.out.println("s5==s3? "+(s5==s3));  //true have same memory
		System.out.println("s6==s3? "+(s6==s3));  //false not same memory
		System.out.println("s7==s3? "+(s7==s3));  //false not same memory
		
		
		System.out.println("--------------------------------");
		
		s1="Hi";   //new instance get created for s1
		s3+="! how are you";
		System.out.println("new s1: "+s1);
		System.out.println("new s3: "+s3);
		System.out.println("s1==s4? "+(s1==s4));  //false bcz new instance of s1 created
		System.out.println("s5==s3? "+(s5==s3));  //false bcz new instance of s3 created
		System.out.println("s6==s3? "+(s6==s3)); 
		System.out.println("s7==s3? "+(s7==s3));
		
	}

}

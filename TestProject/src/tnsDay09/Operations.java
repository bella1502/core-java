//method overloading
/*signature must be different like: */

package tnsDay09;

public class Operations {
	public static void add()
	{
		System.out.println("Addition");
	}
	public static void add(int a)
	{
		System.out.println("Addition is: "+a);
	}
	public static void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	public static void add(int a,float b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	public static void add(float a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
}

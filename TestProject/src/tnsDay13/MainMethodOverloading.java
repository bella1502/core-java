package tnsDay13;

public class MainMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		System.out.println("num: "+x);
		main(100);
		main(1000.1011);

	}
	public static void main(int x)
	 {
		 System.out.println("num: "+x);
	 }
	 public static void main(double x)
	 {
		 System.out.println("num: "+x);
	 }

}

package tnsDay9;

public class PointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point();
		Point p2=new Point(30f);
		Point p3=new Point(30.2f,20.11f);
		Point p4=new Point(30,20.11f);
		
		System.out.println(p1);   //call toString method
		System.out.println(p2);   //call toString method
		System.out.println(p3);   //call toString method
		System.out.println(p4);   //call toString method
	}

}

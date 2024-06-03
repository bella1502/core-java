package tnsDay9Runtime;

public class Student extends Person {
	private int rno;
	private String course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rno, String course) {
		super();
		this.rno = rno;
		this.course = course;
	}
	
	public Student(String name, String city,int rno, String course) {
		super(name, city);
		this.rno = rno;
		this.course = course;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", course=" + course + "]";
	}
}

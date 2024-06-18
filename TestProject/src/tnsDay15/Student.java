package tnsDay15;

public class Student {

	private int roll;
	private String name;
	private float per;
	private String stream;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, float per, String stream) {
		super();
		this.roll = roll;
		this.name = name;
		this.per = per;
		this.stream = stream;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", per=" + per + ", stream=" + stream + "]\n";
	}
	
}

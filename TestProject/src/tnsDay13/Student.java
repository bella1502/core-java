package tnsDay13;


import java.util.Comparator;

public class Student implements Comparable<Student>{
	private String name;
	private String city;
	private long contactNo;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String city, long contactNo) {
		super();
		this.name = name;
		this.city = city;
		this.contactNo = contactNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", contactNo=" + contactNo + "]";
	}
	
	
	@Override
	public int compareTo(Student o1) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(getName());
	}
}

package tnsDay9Runtime;

public class ClassA {
	int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void show()
	{
		System.out.println("roll= "+n);
	}

	@Override
	public String toString() {
		return "ClassA [n=" + n + "]";
	}
	

}

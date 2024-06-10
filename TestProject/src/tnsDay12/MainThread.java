package tnsDay12;

public class MainThread {
	public static void main(String []args)
	{
		ChildThreadOne t1=new ChildThreadOne();
		ChildThreadTwo t2=new ChildThreadTwo();
		t1.start();
		t2.start();
	}

}

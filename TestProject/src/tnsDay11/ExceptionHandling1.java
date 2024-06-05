package tnsDay11;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		float b=0,c;
		try
		{
			c=a/b;
			System.out.print("division: "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.print("exception occur ");
		}

	}

}
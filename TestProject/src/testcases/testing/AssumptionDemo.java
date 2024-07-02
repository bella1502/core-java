package testcases.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	
	@Test
	void testOnFirstAssumption()
	{
		int a=5,s=25;
		Assumptions.assumeTrue(s==a*a);
		System.out.println("--This will display because assumptiom is true--");
	}
	
	@Test
	void testOnSecondAssumption()
	{
		int age=12;
		Assumptions.assumeFalse(age<50, AssumptionDemo.message());
		System.out.println("--This will skip--");
	}
	
	private static String message()
	{
		return "Test Execution failed";
	}
	
	@Test
	void testOnThirdAssumption()
	{
		int a=5,b=5;
		Assumptions.assumingThat(a==b,()->{
		System.out.println("testing a==b");
		});
		System.out.println("---This will not skip---");
	}
	
}

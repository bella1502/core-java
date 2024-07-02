package testcases.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;;

//@Disabled
@TestInstance(Lifecycle.PER_CLASS)
public class LifeCycleTestClass {
	
	@RepeatedTest(2)
	//@Test
	public void testMethodOne()
	{
		System.out.println("This is test method one: "+this);
	}
	
	@Disabled
	//@Test
	public void testMethodTwo()
	{
		System.out.println("This is test method two: "+this);
	}
	
	@BeforeAll
	public void beforeAllLifeCycleMethod()
	{
		System.out.println("before all");
	}
	
	@AfterAll
	public void afterAllLifeCycleMethod()
	{
		System.out.println("after all");
	}

	@BeforeEach
	public void beforeEachLifeCycleMethod()
	{
		System.out.println("before each");
	}
	
	@AfterEach
	public void afterEachLifeCycleMethod()
	{
		System.out.println("after each");
	}

}

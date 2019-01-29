import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest1 {
	Calculator c=null;
	
	@Before  //It is used to call the annotated function before running each of the tests

	public void before()
	{
	System.out.println("Before Test");
	 c=new Calculator();
	}
	@After  //It is used to call the annotated function after each test method
	public void after()
	{               
	 System.out.println("After Test"); 	}

	@Test //Used to identify that a method is a test method

	public void testAdd() {
	System.out.println("Add function");
	assertEquals("Result",5,c.add(2,3));
		}
	@Test  //Used to identify that a method is a test method

	public void testSub() {
	System.out.println("Sub function");
	assertEquals("Result",20,c.sub(100,80));
	}
	
	@Test (timeout = 5000)
	public void testinfinity() 
	{
		while (true);
	}

}
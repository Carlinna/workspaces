package jjcctest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.internal.runners.TestClass;
import org.junit.runner.RunWith;


//@RunWith(TestClassRunner.class)
public class CalculatorTest {
	
	private static Calculator c = new Calculator();

	@Before
	public void setUp() throws Exception {
		c.clear();
	}

	@Test
	public void testAdd() {
		c.add(5);
		c.add(6);
		assertEquals(11,c.getResult());
		//fail("Not yet implemented");
	}

	@Test
	public void testSubstract() {
		c.add(10);
		c.substract(8);
		assertEquals(2,c.getResult());
		//fail("Not yet implemented");
	}

	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		c.add(10);
		c.divide(5);
		assertEquals(2,c.getResult());
		//fail("Not yet implemented");
	}
	
	//死循环 限时设置
	@Test(timeout  =   1000 ) 
    public void squareRoot()  {
       c.squareRoot( 4 );
       assertEquals( 2 , c.getResult());
       
	}
	
	//异常测试
	@Test(expected  =  ArithmeticException. class )	 
    public void divideByZero()  {
		c.divide( 0 ); 
    } 

}

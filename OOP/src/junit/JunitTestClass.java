package junit;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTestClass {
	@Before
	public void BeforeTest()
	{
		System.out.println("running before test");
	}
	@Test
	public void test_add() {
		Addition app1 = new Addition();
		assertEquals(10, app1.add(5, 5));
		assertEquals(50, app1.add(45, 5));
		assertNotEquals(500, app1.add(250, 249));
		System.out.println("running addition test");
	
	}
	
	@Test
	public void test_add2() {
		Addition app1 = new Addition();
		assertEquals(-10, app1.add(-5, -5));
		assertNotEquals(50, app1.add(45,-5));
		assertNotEquals(-500, app1.add(250, -249));
		System.out.println("running addition test for negative number");
	
	}
	@After
	public void AfterTest()
	{
		System.out.println("running after test");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
		

}

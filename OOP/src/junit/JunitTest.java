package junit;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	@BeforeClass
	public static  void BeforeClass()
	{
		System.out.println("running before class");
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
	@AfterClass
	public  static   void AfterClass()
	{
		System.out.println("running after class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
		

}

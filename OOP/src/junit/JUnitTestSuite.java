package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
	
@RunWith(Suite.class)
@Suite.SuiteClasses({
	//provide all the test you wanted to run
	JunitTest.class,
	 JunitTestClass.class
})
public class JUnitTestSuite {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

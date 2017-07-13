package junit3.bootstrap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * 
 * @author donald
 * 2017年7月12日
 * 下午10:40:23
 */
public class TestsSuite3 extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(TestsSuite3.class.getName());
		suite.addTestSuite(TestCalculateCase3.class);
		suite.addTestSuite(TestOtherCase3.class);
		return suite;
	}

}

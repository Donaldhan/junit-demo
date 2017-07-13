/**
 * 
 */
package junit3.bootstrap;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;
import junit3.app.Calculate;
import junit3.bootstrap.TestCalculateCase3;

/**
 * @author donald
 * 2017年7月12日
 * 下午10:39:23
 */
public class TestCalculateCase3 extends TestCase {
	private static final Logger log = LoggerFactory.getLogger(TestCalculateCase3.class);
	private static Calculate calculate = null;
	static {
		calculate = new Calculate();
	}
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link junit3.app.Calculate#sum(int, int)}.
	 */
	public void testSum() {
		int result = calculate.sum(17, 8);
		assertEquals("计算异常", 25, result);
		log.info("=========testSum：加法计算");
//		assertEquals(25, result);
//		fail方法是指测试失败
//		fail("Not yet implemented");
	}
	/**
	 * Test method for {@link junit3.app.Calculate#isInteger(java.lang.Object)}.
	 */
	public void testIsInteger() {
		Double a = new Double(0);
		assertTrue("非整数",calculate.isInteger(a));
		log.info("=========testIsInteger：是否整数");
	}
	/**
	 * 
	 */
	public void testCheckNull() {
		Double a = new Double(0);
		assertNull("非空",a);
	}
	public void testString() {
		String result = "hello";
		assertEquals("正在通话中","bye",result);
		log.info("=========testString：是否通话结束");
	}
}

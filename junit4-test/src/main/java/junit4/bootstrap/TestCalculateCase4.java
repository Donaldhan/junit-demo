/**
 * 
 */
package junit4.bootstrap;
//导入Assert的所有静态方法
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit4.app.Calculate;
import junit4.exp.ArgumentException;
import junit4.exp.BussinessException;

/**
 * 1. @Test : 测试方法，测试程序会运行的方法，后边可以跟参数代表不同的测试
 * ，如(expected=XXException.class) 异常测试，(timeout=xxx)超时测试
 * 2. @Ignore : 被忽略的测试方法
 * 3. @Before: 每一个测试方法之前运行
 * 4. @After : 每一个测试方法之后运行
 * 5. @BeforeClass: 所有测试开始之前运行
 * 6. @AfterClass: 所有测试结束之后运行
 * fail方法是指测试失败
 * assertEquals测试2个参数是否相等
 * @author donald 2017年7月12日 下午10:34:36
 */
public class TestCalculateCase4 {
	private static final Logger log = LoggerFactory.getLogger(TestCalculateCase4.class);
	private static Calculate calculate = null;
	/**
	 * 所有测试开始之前运行,初始化资源
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpAfterClass() throws Exception {
		log.info("=========setUpAfterClass===========");
		calculate = new Calculate();
	}
	/**
	 * 所有测试结束之后运行，关闭资源
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		log.info("=========tearDownAfterClass===========");
		calculate = null;
	}

	/**
	 * 每一个测试方法之前运行
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		log.info("=========setUp===========");
	}

	/**
	 *  每一个测试方法之后运行
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		log.info("=========tearDown===========");
	}

	/**
	 * Test method for {@link junit4.app.Calculate#sum(int, int)}.
	 */
	@Test
	public void testSum() {
		int result = calculate.sum(17, 8);
		assertEquals("计算异常", 25, result);
		log.info("=========testSum：加法计算");
//		assertEquals(25, result);
//		fail方法是指测试失败
//		fail("Not yet implemented");
	}
	/**
	 * Test method for {@link junit4.app.Calculate#divide(int, int)}.
	 * @throws ArgumentException 
	 */
	@Test(expected=ArgumentException.class)
	public void testDivide()  {
		try {
			calculate.divide(5, 0);
		} catch (ArgumentException e) {
			e.printStackTrace();
		}
		log.info("=========testDivide：除法计算");
	}

	/**
	 * 捕捉运行时异常
	 * Test method for {@link junit4.app.Calculate#hanlderBussiness()}.
	 */
	@Test(expected=BussinessException.class)
	public void testHanlderBussiness() {
//		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link junit4.app.Calculate#isInteger(java.lang.Object)}.
	 */
	@Test
	public void testIsInteger() {
		Double a = new Double(0);
		assertTrue("非整数",calculate.isInteger(a));
		log.info("=========testIsInteger：是否整数");
	}
	/**
	 * 
	 */
	@Test
	public void testCheckNull() {
		Double a = new Double(0);
		assertNull("非空",a);
	}
	@Test
	public void testString() {
		String result = "hello";
		assertEquals("正在通话中","bye",result);
		log.info("=========testString：是否通话结束");
	}
	/**
	 * Test method for {@link junit4.app.Calculate#multiply(int, int)}.
	 */
	@Test(timeout=1000)
	public void testMultiply() {
        try {
			Thread.sleep(2000);
			calculate.multiply(17, 8);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        log.info("=========testMultiply：乘法计算是否规定时间内完成");
	}
	@Ignore  
    public void testIgnore(){  
        log.info("====@Ignore========");  
    }  

}

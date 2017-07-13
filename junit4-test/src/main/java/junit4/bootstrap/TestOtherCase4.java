package junit4.bootstrap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 */
public class TestOtherCase4 {
	private static final Logger log = LoggerFactory.getLogger(TestOtherCase4.class);
	@Before
	public void setUp() throws Exception {
		log.info("=========setUp===========");
	}

	@After
	public void tearDown() throws Exception {
		log.info("=========tearDown===========");
	}

	@Test
	public void testCompareArray() {
		assertArrayEquals("数组不相等",new int[]{1,2},new int[]{2,3});
		log.info("=====testCompareArray:数组是否相等？");
	}
	@Test
	public void testCompareObject() {
		assertSame("对象不相等",new Integer(0),new Double(1));
		log.info("=====testCompareObject:对象是否相等？");
	}
	

}

package junit3.bootstrap;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;
/**
 * 
 */
public class TestOtherCase3 extends TestCase{
	private static final Logger log = LoggerFactory.getLogger(TestOtherCase3.class);
	public void setUp() throws Exception {
		super.setUp();
		log.info("=========setUp===========");
	}

	public void tearDown() throws Exception {
		super.tearDown();
		log.info("=========tearDown===========");
	}

	public void testCompareObject() {
		assertSame("对象不相等",new Integer(0),new Double(1));
	}
	

}
